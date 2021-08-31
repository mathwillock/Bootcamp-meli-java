package com.company.ExececoesUtilitarios.Exercicios.Exercicio2;

public class OperacaoFinal {

    public static void main(String[] args) {


        String mensagemFinal = "Esta é a última mensagem";
        try {
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(mensagemFinal);
        }



    }


}
