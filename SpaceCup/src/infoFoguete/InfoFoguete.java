
package infoFoguete;

import grupo.Grupo;

public class InfoFoguete {
   private double distanciaAlvo;
   private double anguloLancamento;
   private double velocidadeVento;
   private double peso;
   private double altitudeMax;
   private double velocidadeMax;
   private double tempoPropulsao;
   private double picoAceleracao;
   private double acelerMedia;
   private double tempoApogeuDescida;
   private double tempoEjecao;
   private double altitudeEjecao;
   private double taxaDescida;
   private double duracaoVoo;
   
    public InfoFoguete(double distanciaAlvo, double anguloLancamento, double velocidadeVento, double peso, double altitudeMax, double velocidadeMax, double tempoPropulsao, double picoAceleracao, double acelerMedia, double tempoApogeuDescida, double tempoEjecao, double altitudeEjecao, double taxaDescida, double duracaoVoo) {
        this.distanciaAlvo = distanciaAlvo;
        this.anguloLancamento = anguloLancamento;
        this.velocidadeVento = velocidadeVento;
        this.peso = peso;
        this.altitudeMax = altitudeMax;
        this.velocidadeMax = velocidadeMax;
        this.tempoPropulsao = tempoPropulsao;
        this.picoAceleracao = picoAceleracao;
        this.acelerMedia = acelerMedia;
        this.tempoApogeuDescida = tempoApogeuDescida;
        this.tempoEjecao = tempoEjecao;
        this.altitudeEjecao = altitudeEjecao;
        this.taxaDescida = taxaDescida;
        this.duracaoVoo = duracaoVoo;
    }

    public double getDistanciaAlvo() {
        return distanciaAlvo;
    }

    public double getAnguloLancamento() {
        return anguloLancamento;
    }

    public double getVelocidadeVento() {
        return velocidadeVento;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltitudeMax() {
        return altitudeMax;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public double getTempoPropulsao() {
        return tempoPropulsao;
    }

    public double getPicoAceleracao() {
        return picoAceleracao;
    }

    public double getAcelerMedia() {
        return acelerMedia;
    }

    public double getTempoApogeuDescida() {
        return tempoApogeuDescida;
    }

    public double getTempoEjecao() {
        return tempoEjecao;
    }

    public double getAltitudeEjecao() {
        return altitudeEjecao;
    }

    public double getTaxaDescida() {
        return taxaDescida;
    }

    public double getDuracaoVoo() {
        return duracaoVoo;
    }

    public void setDistanciaAlvo(double distanciaAlvo) {
        this.distanciaAlvo = distanciaAlvo;
    }

    public void setAnguloLancamento(double anguloLancamento) {
        this.anguloLancamento = anguloLancamento;
    }

    public void setVelocidadeVento(double velocidadeVento) {
        this.velocidadeVento = velocidadeVento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltitudeMax(double altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public void setTempoPropulsao(double tempoPropulsao) {
        this.tempoPropulsao = tempoPropulsao;
    }

    public void setPicoAceleracao(double picoAceleracao) {
        this.picoAceleracao = picoAceleracao;
    }

    public void setAcelerMedia(double acelerMedia) {
        this.acelerMedia = acelerMedia;
    }

    public void setTempoApogeuDescida(double tempoApogeuDescida) {
        this.tempoApogeuDescida = tempoApogeuDescida;
    }

    public void setTempoEjecao(double tempoEjecao) {
        this.tempoEjecao = tempoEjecao;
    }

    public void setAltitudeEjecao(double altitudeEjecao) {
        this.altitudeEjecao = altitudeEjecao;
    }

    public void setTaxaDescida(double taxaDescida) {
        this.taxaDescida = taxaDescida;
    }

    public void setDuracaoVoo(double duracaoVoo) {
        this.duracaoVoo = duracaoVoo;
    }
   
    
}
