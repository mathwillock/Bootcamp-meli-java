package com.company.PraticaIntegradora.Pratica5;

public class banco extends Transacao {


    public boolean deposito(String cliente){
        if(cliente.equals("Executivo")){
            return transactionOk();
        }else{
            return transactionNoOk();
        }
    }

    public boolean transferencia(String cliente){
        if(cliente.equals("Executivo")){
            return transactionOk();
        }else{
            return transactionNoOk();
        }
    }

    public boolean retirada(String cliente){
        if(cliente.equals("basico") || cliente.equals("Coletores")){
            return transactionOk();
        }else{
            return transactionNoOk();
        }
    }

    public boolean consultaSaldo(String cliente){
        if(cliente.equals("Basico") || cliente.equals("Coletores")){
            return transactionOk();
        }else{
            return transactionNoOk();
        }
    }

    public boolean pagamentoDeServicos(String cliente){
        if(cliente.equals("Basico")){
            return transactionOk();
        }else{
            return transactionNoOk();
        }
    }

}