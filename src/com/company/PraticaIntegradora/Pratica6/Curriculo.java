package com.company.PraticaIntegradora.Pratica6;

import java.util.List;

public class Curriculo extends Imprimir {

    private Pessoa pessoa = new Pessoa();

    public Curriculo(String nome, String idade, Endereco endereco, List<String> habilidades) {
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setEndereco(endereco);
        pessoa.setHabilidades(habilidades);
    }

    public void imprimir() {
        imprimir(this);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }


}
