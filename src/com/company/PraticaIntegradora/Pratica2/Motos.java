package com.company.PraticaIntegradora.Pratica2;

public class Motos extends Veiculo{
    String placa;
    String nome;

    // Construtor

    public Motos(double velocidade, double aceleracao, double anguloDeVirada, double peso, String patente, String rodas, String placa, String nome) {
        super(velocidade, aceleracao, anguloDeVirada, peso, patente, rodas);
        this.placa = placa;
        this.nome = nome;
    }

    public Motos(double velocidade, double aceleracao, double anguloDeVirada, String placa, String nome) {
        super(velocidade, aceleracao, anguloDeVirada);
        this.placa = placa;
        this.nome = nome;
    }

    //
//    public void adicionarMoto(String velocidade, int aceleracao, double anguloDeVirada, String placa) {
//        this.velocidade = velocidade;
//        this.aceleracao = aceleracao;
//        this.anguloDeVirada = anguloDeVirada;
//        this.placa = placa;
//    }

}
