
package dao;

import conexao.Conexao;
import grupo.Grupo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GrupoDAO {
    Connection connection = null;
    
    public void cadastrar(Grupo grupo){
        try {
            String sql = "insert into grupo values (?, ?, ?, ?)";
            connection = Conexao.getInstance().getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, grupo.getNome());
            p.setString(2, grupo.getIntegrantes());
            p.setString(3, grupo.getTurma());
            p.setDate(4, new Date(grupo.getDataLancamento().getTime()));
            p.execute();
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
    
    public Grupo pesquisar(String nome, String integrante, String turma){        
        String sql = "select * from grupo where ";
        
        //Define com quais campos fará a pesquisa
        if(nome != null && !nome.isEmpty() && integrante != null && !integrante.isEmpty())
            sql = sql + " nome = ? and integrantes = ?";
        else if(nome != null && !nome.isEmpty() && (integrante == null || integrante.isEmpty()))
            sql = sql + " nome = ?";
        else if((nome == null || nome.isEmpty()) && integrante != null && !integrante.isEmpty())
            sql = sql + " integrantes = ?";
        else if(nome != null && !nome.isEmpty() && integrante != null && !integrante.isEmpty() && turma != null)
            sql = sql + " nome = ? and integrantes = ? and turma = ?";
        else if(nome != null && !nome.isEmpty() && (integrante == null || integrante.isEmpty() && turma != null))
            sql = sql + " nome = ? and turma = ?";
        else if((nome == null || nome.isEmpty()) && integrante != null && !integrante.isEmpty() && turma != null)
            sql = sql + " integrantes = ? and turma = ?";
        else if((nome == null || nome.isEmpty()) && (integrante == null || integrante.isEmpty()) && turma != null)
            sql = sql + " turma = ?";
        else
            return null;    
        
        Grupo grupo = null;
        try {
            connection = Conexao.getInstance().getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            
            if(nome != null && !nome.isEmpty() && integrante != null && !integrante.isEmpty()){
                p.setString(1, nome);
                p.setString(2, integrante);
            }else if(nome != null && !nome.isEmpty() && (integrante == null || integrante.isEmpty() ))
                p.setString(1, nome);
            else if((nome == null || nome.isEmpty()) && integrante != null && !integrante.isEmpty())
                p.setString(1, integrante);
            else if(nome != null && !nome.isEmpty() && integrante != null && !integrante.isEmpty() && turma != null){
                p.setString(1, nome);
                p.setString(2, integrante);
                p.setString(3, turma);
            }else if(nome != null && !nome.isEmpty() && (integrante == null || integrante.isEmpty()) && turma != null){
                p.setString(1, nome);
                p.setString(2, turma);
            }else if((nome == null || nome.isEmpty()) && integrante != null && !integrante.isEmpty() && turma != null){
                p.setString(1, integrante);
                p.setString(2, turma);
            }else if((nome == null || nome.isEmpty()) && (integrante == null || integrante.isEmpty()) && turma != null)
                p.setString(1, turma);
            else
                return null;
            
            ResultSet rs = p.executeQuery();
            
            while(rs.next()) {
                String integrantes = rs.getString("integrantes");
                String turmaOk = rs.getString("turma");
                Date dataLancamento = rs.getDate("data_lancamento");
                grupo = new Grupo(nome, integrantes, turmaOk, dataLancamento, null);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(GrupoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        return grupo;
    }
    
    public void alterar(Grupo grupo){
        try {
            String sql = "update grupo set integrantes = ?, turma = ?, data_lancamento = ? where nome = ?";
            connection = Conexao.getInstance().getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, grupo.getIntegrantes());
            p.setString(2, grupo.getTurma());
            p.setDate(3, new Date(grupo.getDataLancamento().getTime()));
            p.setString(4, grupo.getNome());
            p.execute();
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
    
    public void excluir(String nome){
        String sql = "delete from grupo where nome = ?";
        try {
            connection = Conexao.getInstance().getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, nome);
            p.execute();
    }
        catch(SQLException e) {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(GrupoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String verificarNomeGrupo(String nomeGrupo){
        String resultado = null;
        try{
            String sql = "select nome from grupo";
            connection = Conexao.getInstance().getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                if(nomeGrupo.equals(rs.getString("nome")))
                    resultado = rs.getString("nome");
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
        return resultado;
    }
}
