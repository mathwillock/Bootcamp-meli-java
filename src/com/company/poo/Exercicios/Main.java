package com.company.poo.Exercicios;

public class Main {
    public static void main(String[] args) {


        Pessoa alien = new Pessoa();

        Pessoa ninja = new Pessoa("Hiruzen", 83);

        Pessoa pirata = new Pessoa("Luffy", 23, "0912");

        Pessoa humano = new Pessoa("Luffy", "2308", 1.75, 17, 100);




        System.out.println(
                humano.toString() + ". " + humano.calcularIMC() + " e " + humano.MaiorDeIdade()
        );


       // System.out.println(
         //       alien.toString() + ". " + alien.calcularIMC() + " e " + alien.MaiorDeIdade()
       // );

    }
}
