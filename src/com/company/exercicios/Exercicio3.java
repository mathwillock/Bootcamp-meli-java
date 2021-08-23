package com.company.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {


        //Corrigido
        Scanner scan = new Scanner(System.in);

        int diasTrabalhados = 0;
        int valorFixo = 2;

        System.out.println(
                "Digite o numero de dias da campanha: "
        );

        diasTrabalhados = scan.nextInt();

        int total = diasTrabalhados * valorFixo;

        System.out.println("$" + total);





    }
}
