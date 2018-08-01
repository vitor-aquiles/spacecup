
package dao;

import conexao.Conexao;
import grupo.Grupo;
import infoFoguete.InfoFoguete;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import formularios.FormInformacao;
import java.sql.ResultSet;

public class InfoFogueteDAO {
    Connection connection = null;
    
    public void cadastrar(InfoFoguete infoFoguete, String grupoNome){
        try {
            String sqlPre = "insert into info_pre values (?, ?, ?, ?, ?)";
            String sqlPos = "insert into info_pos values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            connection = Conexao.getInstance().getConnection();
            PreparedStatement pre = connection.prepareStatement(sqlPre);
            pre.setDouble(1, infoFoguete.getDistanciaAlvo());
            pre.setDouble(2, infoFoguete.getAnguloLancamento());
            pre.setDouble(3, infoFoguete.getVelocidadeVento());
            pre.setDouble(4, infoFoguete.getPeso());
            pre.setString(5, grupoNome);
            pre.execute();
            PreparedStatement pos = connection.prepareStatement(sqlPos);
            pos.setDouble(1, infoFoguete.getAltitudeMax());
            pos.setDouble(2, infoFoguete.getVelocidadeMax());
            pos.setDouble(3, infoFoguete.getTempoPropulsao());
            pos.setDouble(4, infoFoguete.getPicoAceleracao());
            pos.setDouble(5, infoFoguete.getAcelerMedia());
            pos.setDouble(6, infoFoguete.getTempoApogeuDescida());
            pos.setDouble(7, infoFoguete.getTempoEjecao());
            pos.setDouble(8, infoFoguete.getAltitudeEjecao());
            pos.setDouble(9, infoFoguete.getTaxaDescida());
            pos.setDouble(10, infoFoguete.getDuracaoVoo());
            pos.setString(11, grupoNome);
            pos.execute();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                connection.close();
            }
            catch (SQLException ex) {
                Logger.getLogger(GrupoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void alterar(InfoFoguete infoFoguete, Grupo grupo){
        try {
            String sqlPre = "update info_pre set distancia_alvo = ?, angulo_lancamento = ?, velocidade_vento = ?, peso_foguete = ? where grupo_nome = ?";
            String sqlPos = "update info_pos set altitude_max = ?, velocidade_max = ?, tempo_propulsao = ?, pico_aceleracao = ?, aceleracao_media = ?"
                    + " tempo_apogeu_descida = ?, tempo_ejecao = ?, altitude_ejecao = ?, taxa_descida = ?, duracao_voo = ? where grupo_nome = ?";
            connection = Conexao.getInstance().getConnection();
            PreparedStatement pre = connection.prepareStatement(sqlPre);
            pre.setDouble(1, infoFoguete.getDistanciaAlvo());
            pre.setDouble(2, infoFoguete.getAnguloLancamento());
            pre.setDouble(3, infoFoguete.getVelocidadeVento());
            pre.setDouble(4, infoFoguete.getPeso());
            pre.setString(5, grupo.getNome());
            pre.execute();
            PreparedStatement pos = connection.prepareStatement(sqlPos);
            pos.setDouble(1, infoFoguete.getAltitudeMax());
            pos.setDouble(2, infoFoguete.getVelocidadeMax());
            pos.setDouble(3, infoFoguete.getTempoPropulsao());
            pos.setDouble(4, infoFoguete.getPicoAceleracao());
            pos.setDouble(5, infoFoguete.getAcelerMedia());
            pos.setDouble(6, infoFoguete.getTempoApogeuDescida());
            pos.setDouble(7, infoFoguete.getTempoEjecao());
            pos.setDouble(8, infoFoguete.getAltitudeEjecao());
            pos.setDouble(9, infoFoguete.getTaxaDescida());
            pos.setDouble(10, infoFoguete.getDuracaoVoo());
            pos.setString(11, grupo.getNome());
            pos.execute();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                connection.close();
            }
            catch (SQLException ex) {
                Logger.getLogger(GrupoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public InfoFoguete setInfoFoguete(String nomeGrupo){
        InfoFoguete infoFoguete = null;
        try{
            String sqlPre = "select * from info_pre where grupo_nome = ?";
            String sqlPos = "select * from info_pos where grupo_nome = ?";
            connection = Conexao.getInstance().getConnection();
            PreparedStatement pre = connection.prepareStatement(sqlPre);
            pre.setString(1, sqlPre);
            ResultSet rsPre = pre.executeQuery();
            PreparedStatement pos = connection.prepareStatement(sqlPos);
            pos.setString(1, sqlPre);
            ResultSet rsPos = pos.executeQuery();
            
            while(rsPre.next() && rsPos.next()){
                double distanciaAlvo = rsPre.getDouble("distancia_alvo");
                double anguloLancamento = rsPre.getDouble("angulo_lancamento");
                double velocidadeVento= rsPre.getDouble("velocidade_vento");
                double pesoFoguete = rsPre.getDouble("peso_foguete");
                double altitudeMax = rsPos.getDouble("altitude_max");
                double velocidadeMax = rsPos.getDouble("velocidade_max");
                double tempoPropulsao = rsPos.getDouble("tempo_propulsao");
                double picoAceleracao = rsPos.getDouble("pico_aceleracao");
                double acelerMedia = rsPos.getDouble("aceleracao_media");
                double tempoApogeuDescida = rsPos.getDouble("tempo_apogeu_descida");
                double tempoEjecao = rsPos.getDouble("tempo_ejecao");
                double altitudeEjecao = rsPos.getDouble("altitude_ejecao");
                double taxaDescida = rsPos.getDouble("taxa_descida");
                double duracaoVoo = rsPos.getDouble("duracao_voo");
                infoFoguete = new InfoFoguete(distanciaAlvo, anguloLancamento, velocidadeVento, pesoFoguete, altitudeMax, velocidadeMax, tempoPropulsao, picoAceleracao, acelerMedia, tempoApogeuDescida, tempoEjecao, altitudeEjecao, taxaDescida, duracaoVoo);
            }
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                connection.close();
            }
            catch (SQLException ex) {
                Logger.getLogger(GrupoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        return infoFoguete;
    }
}
