package com.company.poo.Exercicios;

public class Pessoa {

    private int idade;
    private String nome, id;
    private double altura, peso;

    // Construtoes da classe Pessoa;
    public Pessoa(){}

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String id){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, String id, double altura, int idade, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.id = id;
        this.idade = idade;
        this.peso = peso;
    }


    public String getNome() { return nome;}

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String MaiorDeIdade() {

        boolean maiorIdade;

        String idadeValidada = "";

        if(idade <= 18) {
            maiorIdade = false;

            if ( maiorIdade != true) {
                idadeValidada = "Voce é menor de idade";
            }

        } else {
            maiorIdade = true;

            if(maiorIdade != false ) {
                idadeValidada = "Voce é maior de idade";
            }
        }

        return idadeValidada;
    }

    public String calcularIMC() {


       // String maiorIdade = MaiorDeIdade(); chamada callback MaiorDeIdade


        // this.peso = peso;
        // this.altura = altura;


        int formulaResultado = 0;

        String indiceIMC = "";

        double formula = peso/(altura * 2 );

        if (formula < 20) {
            formulaResultado = -1;
        } else if (formula >= 20 || formula <= 25) {
            formulaResultado = 0;
        } else if (formula > 25) {
            formulaResultado = 1;
        }

        switch (formulaResultado) {
            case -1:
                indiceIMC = "Voce está com Baixo peso";
            break;
            case 0:
                indiceIMC = "Voce está com Peso saudável";
            break;
            case 1:
                indiceIMC = "Voce está com Sobrepeso";
            break;

        }

        //System.out.println(indiceIMC);

        return indiceIMC;
    }

    @Override
    public String toString(){
        return "nome: " + nome + " idade: " + idade;
    }



}
