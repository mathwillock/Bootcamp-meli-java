package com.company.loop;

public class While {
    public static void main(String[] args) {
        int valorSomado = 4;
        int fatorial = 1;

        while ( valorSomado > 1) {
            fatorial *= valorSomado;
            valorSomado --;

            System.out.println(fatorial);
        }

        System.out.println(fatorial);
    }
}
