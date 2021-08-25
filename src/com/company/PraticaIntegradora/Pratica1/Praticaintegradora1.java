package com.company.PraticaIntegradora.Pratica1;

import java.util.ArrayList;
import java.util.List;

public class Praticaintegradora1 {
    public static void main(String[] args) {


        // Criando uma lita dentro da class main
        List<Roupa> roupaNova = new ArrayList<>();

        List<Roupa> roupaNova2 = new ArrayList<>();


        // Adicionando Roupas
        roupaNova.add( new Roupa( "Nike", "Polo" ) );

        roupaNova2.add( new Roupa( "Lacoste", "t-shirt" ) ) ;

        GuardaRoupa guardaRoupa = new GuardaRoupa() ;

        // acessar class dps método
        guardaRoupa.guardarRoupas(roupaNova);

        guardaRoupa.guardarRoupas(roupaNova2);

        guardaRoupa.mostrarRoupas();

        guardaRoupa.devolverRoupas(1);

        System.out.println("**********************");

        guardaRoupa.mostrarRoupas();








    }
}
