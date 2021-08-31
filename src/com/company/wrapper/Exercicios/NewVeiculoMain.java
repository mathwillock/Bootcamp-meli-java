package com.company.wrapper.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class NewVeiculoMain {


    public static void main(String[] args) {

        // Criando a lista
        List<Veiculo> veiculos = new ArrayList<>();

        // Add os carros a lista antes criada.
        veiculos.add(new Veiculo("Fiesta", "Ford", 1000.0));
        veiculos.add(new Veiculo("Focus", "Ford", 1200.0));
        veiculos.add(new Veiculo("Explorer", "Ford", 2500.0));
        veiculos.add(new Veiculo("Uno", "Fiat", 500.0));
        veiculos.add(new Veiculo("Cronos", "Fiat", 1000.0));
        veiculos.add(new Veiculo("Torino", "Fiat", 1250.0));
        veiculos.add(new Veiculo("Aveo", "Chevrolet", 1250.0));
        veiculos.add(new Veiculo("Spin", "Chevrolet", 2500.0));
        veiculos.add(new Veiculo("Corola", "Toyota", 1200.0));
        veiculos.add(new Veiculo("Fortuner", "Toyota", 3000.0));
        veiculos.add(new Veiculo("Logan", "Renault", 950.0));

        // Inserindo a lista de carros dentro da garagem.
        Garagem garagem = new Garagem(veiculos);

         veiculos.stream().mapToInt((p) -> (int) p.getPreco()).sorted().forEach(System.out::println);

         veiculos.stream().map((marca) -> (String) marca.getMarca()).sorted().forEach(System.out::println);



    }



}
