package com.company.poo;

public class Pessoa {

    private int id, idade;
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf, int id, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "nome: " + nome + " idade: " + idade + " CPF: " + cpf + " id: " + id;
    }




}
