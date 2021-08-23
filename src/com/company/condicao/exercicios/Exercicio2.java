package com.company.condicao.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Digite o RG: "
        );

        String rgFuncionario = scan.next();

        System.out.println(
                "Digite o valor do seu salário: "
        );

        double salario = scan.nextDouble();

        double porcentagemAumento = 0.0;

        double salarioNovo = 0.0;

        if (salario <= 20000) {
            porcentagemAumento = salario * 0.20;
            salarioNovo = salario + porcentagemAumento;
        } else if (salario > 20000 && salario <= 45000) {
                porcentagemAumento = salario * 0.10;
                salarioNovo = salario + porcentagemAumento;
        } else {
            porcentagemAumento = salario * 0.05;
            salarioNovo = salario + porcentagemAumento;
        }

        System.out.printf("Seu novo salário: %.2f" , salarioNovo);

    }
}
