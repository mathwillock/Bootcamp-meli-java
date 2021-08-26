package com.company.heranca;

public class Jogador extends Pessoa{



    protected boolean aindaJoga;

    public void dizerSeAindaJoga(){
        String menssagemFinal;

        if( aindaJoga != false) {
            menssagemFinal = "Sim, ainda jogo.";
        } else {
            menssagemFinal = "Não jogo mais";
        }

        System.out.println(aindaJoga);
        System.out.println(menssagemFinal);





    }




}
