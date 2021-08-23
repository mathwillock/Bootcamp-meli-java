package com.company.vetores.exercicios;

public class Exercicio {
    public static void main(String[] args) {

        String [] cidades = new String[10]; // { Londres, Madrid, Nueva York,Buenos Aires, Asunción, São Paulo, Lima,
        // Santiago de Chile, Lisboa, Tokio};

        cidades[0] = "Londres";
        cidades[1] = "Madrid";
        cidades[2] = "Nueva York";
        cidades[3] = "Buenos Aires";
        cidades[4] = "Asunción";
        cidades[5] = "São Paulo";
        cidades[6] = "Lima";
        cidades[7] = "Santiago de Chile";
        cidades[8] = "Lisboa";
        cidades[9] = "Tokio";

        int [][] temp = new int[10][2];

        temp[0][0] = -2;
        temp[0][1] = 33;

        temp[1][0] = -3;
        temp[1][1] = 32;

        temp[2][0] = -8;
        temp[2][1] = 27;

        temp[3][0] = 4;
        temp[3][1] = 37;

        temp[4][0] = 6;
        temp[4][1] = 42;

        temp[5][0] = 5;
        temp[5][1] = 43;

        temp[6][0] = 0;
        temp[6][1] = 39;

        temp[7][0] = -7;
        temp[7][1] = 26;

        temp[8][0] = -1;
        temp[8][1] = 31;

        temp[9][0] = -10;
        temp[9][1] = 35;


        for (int c = 0; c < cidades.length; c ++) {

            // System.out.println(cidades[c]);

            for (int t = 0; t < 2; t ++) {


                System.out.println("cidade: " + cidades[c] + " temperatura miníma: " + temp[c][t]);


            }

         }






    }
}
