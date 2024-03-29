package com.company.collections.Exercicios;

public class Pessoa {


    private final String rg;
    private final String nome;
    private final String sobrenome;
    private final String telefone;
    private final int idade;
    private double valorInscricao;

    public double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public Pessoa(String rg, String nome, String sobrenome, String telefone, int idade) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "rg='" + rg + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                ", valorInscricao=" + valorInscricao +
                '}';
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }


    public int getIdade() {
        return idade;
    }



}
