package com.company.PraticaIntegradora.Pratica2;

public class Main {

    public static void main(String[] args) {


        System.out.println("\n");
        Corrida corrida = new Corrida(56d, 50000d, " Rali dos Sertões", 5);

        System.out.println("Corrida:" + corrida.getNome() + " -- Distancia da corria: " + corrida.getDistancia());
        System.out.println("\n");
        corrida.adicionarCarro(200, 10.0, 90, " ksd1234", " Onix");
        corrida.adicionarCarro(250, 15.0, 90, " ktg9876", " S10");
        corrida.adicionarMoto(150, 8.0, 90, " mht1234", " YBR");
        corrida.adicionarMoto(160, 9.0, 90, " pol1234", " BROS");

        corrida.adicionarMoto(180, 7.0, 80, "pol1236", " BROS");


    }





}
