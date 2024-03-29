package com.company.PraticaIntegradora.Pratica2;

public class Carros extends Veiculo{

    // Atributos
    private String marca;
    private String cor;
    private String modelo;
    private static String placa;

    // getters and setters
    public static String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        Carros.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // contrutors
    public Carros(double velocidade, double aceleracao, double anguloDeVirada, String placa, String nome) {
        super(velocidade, aceleracao, anguloDeVirada);
    }

    public Carros(double velocidade, double aceleracao, double anguloDeVirada, String placa) {
        super(velocidade, aceleracao, anguloDeVirada);
        Carros.placa = placa;
    }

}
