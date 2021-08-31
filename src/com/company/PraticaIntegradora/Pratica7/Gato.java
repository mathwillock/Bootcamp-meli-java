package com.company.PraticaIntegradora.Pratica7;

public class Gato extends Animal implements Carnivoro{

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("miau");
    }

    @Override
    public void comerMeat() {
        System.out.println("Comendo");
    }
}
