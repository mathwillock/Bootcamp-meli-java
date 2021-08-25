package com.company.PraticaIntegradora.Pratica1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class GuardaRoupa {
        private int contador = 0;

        // dicionario
       // List<Roupa> nike = new ArrayList<>(); o List nos dá indexado o Map não.

        // Mapear com os tipos de dados // O map é uma interface e hash é interfce e List são interface sem atributos.
        Map< Integer, List<Roupa> > pecasVestuario = new HashMap<>(); // A lista vai chamar a classe roupa e vai conter todos os atributos somente (marca e modelo).

        // método guardar Roupas
        public Integer guardarRoupas(List<Roupa> listaDeRoupas) {

            pecasVestuario.put(++contador, listaDeRoupas);

            return contador;

        }

        public void mostrarRoupas() {

                // o for vai percorrer o dicionario(pecasVestuario) e vai pegar as chaves.
            for(Integer code:pecasVestuario.keySet()){

                // adicinar ao code a lista pecasVestuario. vamos pegar o código das roupas
                List<Roupa> listaRoupaAMostra = pecasVestuario.get(code);

                // vai juntar a lista para identifcar de forma relacional com as chaves => código <-> roupa.
                for( Roupa roupa:listaRoupaAMostra ){
                    System.out.println(roupa.toString()); // Lista totalmente organizada
                }

            }

        }


        public List<Roupa> devolverRoupas(int id) {

            // Localizar dentro do hashmap o contúdo através de uma chave.
            List<Roupa> listagemRoupas = pecasVestuario.get(id);

            // Removendo através do id localizado na lista anterior.
            pecasVestuario.remove(id);

            return listagemRoupas;

        }








    }
