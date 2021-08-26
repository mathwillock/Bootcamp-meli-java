package com.company.ExececoesUtilitarios.Exercicios.Exercicio2;

public class OperacaoFinal {

    public static void main(String[] args) {


            //Mensagem final
        String mensagemFinal = "Esta é a última mensagem";

            //Código que lança exceção
        int[] numeros = new int[5];
        try {
            numeros[5] = 1;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocorreu um erro: " + e + " VOLTE 5 CASAS");
        } finally {
            System.out.println(mensagemFinal);
        }



    }


}
