package com.company.PraticaIntegradora.Pratica2;

public class Carros extends Veiculo{
    // Atributos
    String placa;
    String nome;
    int peso = 1000;

    // Construtor
    public Carros(double velocidade, double aceleracao, double anguloDeVirada, double peso, String patente, String rodas, String placa, String nome ) {
        super(velocidade, aceleracao, anguloDeVirada, peso, patente, rodas);
        this.placa = placa;
        this.nome = nome;
    }

    public Carros(double velocidade, double aceleracao, double anguloDeVirada, String placa, String nome) {
        super(velocidade, aceleracao, anguloDeVirada);
        this.placa = placa;
        this.nome = nome;
    }

    //    // métodos add carro.
//    public void adicionarCarro(String velocidade, int aceleracao, double anguloDeVirada, String placa) {
//        this.velocidade = velocidade;
//        this.aceleracao = aceleracao;
//        this.anguloDeVirada = anguloDeVirada;
//        this.placa = placa;
//    }
}
