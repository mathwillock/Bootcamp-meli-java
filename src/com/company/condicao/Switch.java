package com.company.condicao;

public class Switch {

    public static void main(String[] args) {
        int tipoResult = 1;
        String mensagem;

        switch (tipoResult) {
            case 1:
                mensagem = "Aprovado";
                break;
            case 2:
                mensagem = "Reprovado";
                break;
            case 3:
                mensagem = "Reprovado";
                break;
            default:
                mensagem = "Não fez a prova";
                break;
        }

        System.out.println(mensagem);


    }

}
