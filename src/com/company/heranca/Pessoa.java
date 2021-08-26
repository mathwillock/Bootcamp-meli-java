package com.company.heranca;

public class Pessoa {

    String nome;
    protected int idade;

    public Pessoa () {}

    public void apresentacao(){

        System.out.println("Olá, me chamo " + nome + ", e tenho " + idade + " de idade." );

    }


}
