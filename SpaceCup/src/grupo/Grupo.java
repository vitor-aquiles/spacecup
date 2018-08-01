
package grupo;

import infoFoguete.InfoFoguete;
import java.util.Date;

public class Grupo {
    
    private String nome;
    private String integrantes;
    private String turma;
    private Date dataLancamento;
    private InfoFoguete infoFoguete;

    public InfoFoguete getInfoFoguete() {
        return infoFoguete;
    }

    public void setInfoFoguete(InfoFoguete infoFoguete) {
        this.infoFoguete = infoFoguete;
    }

    public Grupo(String nome, String integrantes, String turma, Date dataLancamento, InfoFoguete infoFoguete) {
        this.nome = nome;
        this.integrantes = integrantes;
        this.turma = turma;
        this.dataLancamento = dataLancamento;
        this.infoFoguete = infoFoguete;
    }
    
    public String getNome() {
        return nome;
    }

    public String getIntegrantes() {
        return integrantes;
    }

    public String getTurma() {
        return turma;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIntegrantes(String integrantes) {
        this.integrantes = integrantes;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
