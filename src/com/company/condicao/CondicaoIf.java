package com.company.condicao;

public class CondicaoIf {
    public static void main(String[] args) {
        int number = 1;

        if (number != 1) {
            System.out.println("Primeiro if");
        } else {
            if (number != 1) {
                System.out.println("Primeiro if do else");
            } else {
                System.out.println("Segundo else dentro do else");
            }
        }
    }
}