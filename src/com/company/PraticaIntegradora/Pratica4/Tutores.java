package com.company.PraticaIntegradora.Pratica4;

public class Tutores extends Pessoa implements com.universidade.repository.TutorEnsino {

    private String disciplina;

    public Tutores(String nome, String cpf, String endereco, int idade, String disciplina) {
        super(nome, cpf, endereco, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void ensino() {
        System.out.println("Aula de Programaçao Java POO+\n");
    }
}
