package com.company.Generics.Revisao;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {

        // Criando uma lista de funcinarios
        List <Funcionario> funcionarios = new ArrayList<Funcionario>();

        // Add funcionario a lista funcionarios
        funcionarios.add(new Funcionario("Joao"));
        funcionarios.add(new Funcionario("Maria"));
        funcionarios.add(new Funcionario("Roberto"));
        funcionarios.add(new Funcionario("Ana"));
        funcionarios.add(new Funcionario("Paulo "));


        for (Funcionario funcionario : funcionarios) {

            System.out.println(((Funcionario) funcionario).getNome());
        }

//        Mesma coisa que acima mas gracas ao generics fazemos mais simples o for
//        for (Funcionario funcionario : funcionarios) {
//            Funcionario f = (Funcionario) funcionario;
//
//            System.out.println(f.getNome());
//        }



    }

}
