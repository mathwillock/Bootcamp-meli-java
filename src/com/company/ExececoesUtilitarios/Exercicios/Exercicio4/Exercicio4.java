package com.company.ExececoesUtilitarios.Exercicios.Exercicio4;

public class Exercicio4 {

    double num1;
    double num2;
    double numRes;


    public double retornaMaior(double num1, double num2) {
        return Math.max(num1, num2);
    }

    public double retornaMenor(double num1, double num2) {
            return Math.min(num1, num2);
    }
    public double retornaPotencia(double num1, double num2) {
            return Math.pow(num1, num2);
    }

    public double retornaCosseno(double num1) {
            return Math.cos(num1);
    }

    public double retornaRaiz(double num1) {
        return Math.sqrt(num1);
    }

    public double retornaAleatorio() {
        return Math.floor(Math.random()*1000);
    }


    public static void main(String[] args) {

        Exercicio4 calculos = new Exercicio4();

        double cos = calculos.retornaCosseno(2.4);

        System.out.println(cos);



    }





}
