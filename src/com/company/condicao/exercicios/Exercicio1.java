package com.company.condicao.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Digite o valor do produto: "
        );

        double valorProduto = scan.nextInt();

        System.out.println(
                "Digite a fabrica: "
        );

        int fabrica = scan.nextInt();

        double frete = 0;

        switch (fabrica) {
            case 1:
                frete = (valorProduto * 7)/100;
                break;
            case 2:
                frete = (valorProduto * 15)/100;
                break;
            case 3:
                frete = (valorProduto * 22)/100;
                break;
        }

        double custoEnvio = valorProduto + frete;

        final double lucro = 0.25 * custoEnvio;

        double valorTotal = custoEnvio + lucro;

        System.out.println("Valor final do produto: " + valorTotal);









    }
}
