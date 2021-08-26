package com.company.PraticaIntegradora.Pratica2;

public class Veiculo{

    // Os carros pesam 1000 kg e as motos 300 k, tem 4 rodas e as motos tem 2.

    private double velocidade;
    private double aceleracao;
    private double anguloDeVirada;
    private double peso;
    private String patente;
    private String rodas;


    // Setters Getters
    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getAnguloDeVirada() {
        return anguloDeVirada;
    }

    public void setAnguloDeVirada(double anguloDeVirada) {
        this.anguloDeVirada = anguloDeVirada;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getRodas() {
        return rodas;
    }

    public void setRodas(String rodas) {
        this.rodas = rodas;
    }


    // Construtor
    public Veiculo(){}

    public Veiculo(double velocidade, double aceleracao, double anguloDeVirada, double peso, String patente, String rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
        this.peso = peso;
        this.patente = patente;
        this.rodas = rodas;
    }

    public Veiculo(double velocidade, double aceleracao, double anguloDeVirada) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
    }
}
