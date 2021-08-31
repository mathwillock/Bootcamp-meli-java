package com.company.PraticaIntegradora.Pratica7;

public class Vaca extends Animal implements Herbivoro {

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("muuu");
    }

    @Override
    public void comerHerb() {
        System.out.println("Comendo");
    }
}
