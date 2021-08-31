package com.company.ExececoesUtilitarios.Exercicios.Exercicio1;

public class PracticaExcecoes {

    public static void main(String[] args) {

        int a = 0;
        int b = 300;

        try {
            int quociente = b / a;
        } catch (ArithmeticException ex) {
            System.out.println("Ocorreu um erro:" + ex.getMessage());
        } finally {
            System.out.println("Não pode ser dividido por zero");
        }








    }

}
