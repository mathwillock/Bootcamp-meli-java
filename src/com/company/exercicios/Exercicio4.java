package com.company.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do seu prêmio: ");

        double premioBruto = scan.nextDouble();
        double imposto1 = (2.45 * premioBruto)/100;
        double imposto2 = (15 * premioBruto)/100;
        double imposto3 = (3 * premioBruto)/100;

        double premioLiquido = premioBruto - imposto1 - imposto2 - imposto3;

        System.out.println("Com a aplicação das taxas de imposto, o seu prêmio liquído é: " + premioLiquido );

    }
}
