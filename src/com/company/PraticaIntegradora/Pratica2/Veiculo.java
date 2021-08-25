package com.company.PraticaIntegradora.Pratica2;

public class Veiculo{

    private String velocidade;
    private int aceleracao;
    private double anguloDeVirada;
    private double peso;
    private String patente;
    private String rodas;
    private String[] carros;
    private String[] motos;
    private String placa;


    // Getters and Setters
    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
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

    public String[] getCarros() {
        return carros;
    }

    public void setCarros(String[] carros) {
        this.carros = carros;
    }

    public String[] getMotos() {
        return motos;
    }

    public void setMotos(String[] motos) {
        this.motos = motos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca() {
        this.placa = placa;
    }

    // Os carros pesam 1000 kg e as motos 300 k, tem 4 rodas e as motos tem 2.

    // métodos add carro e moto.
    public void adicionarCarro(String velocidade, int aceleracao, double anguloDeVirada, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
        this.placa = placa;
    }

    public void adicionarMoto(String velocidade, int aceleracao, double anguloDeVirada, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
        this.placa = placa;
    }















}
