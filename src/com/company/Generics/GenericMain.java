package com.company.Generics;

public class GenericMain {

    public static void main(String[] args) {


        // Byte, Short, Long, Float, Double e Character


        int x = 5;
        Integer i = new Integer(5);

        byte y = i.byteValue();

        String valor = "15.5";
        Float v = new Float(valor);
        System.out.println(v + 3);

        int idade = Integer.parseInt("27"); //parse
        System.out.println("Daqui a cinco anos você terá: " + (idade + 5 ) + " anos.");

        String entrada = "23.5 ";

        try {
            double custo = Double.parseDouble(entrada);
            System.out.println("Custo total: " + custo);
        } catch (NumberFormatException e) {
            System.out.println("ERRO: Número inválido para conversão.");
        }

    }


}
