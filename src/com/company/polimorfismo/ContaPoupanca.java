package com.company.polimorfismo;

public class ContaPoupanca extends Conta {

    private double rendimentos = 30;
    protected int mesesPoupado;

    public double getRendimentos() {
        return rendimentos;
    }

//    public void setRendimentos(double rendimentos) {
//        this.rendimentos = rendimentos;
//    }

    public void poupando(){

         double valorPoupado = (saldo * 30)/100 ;
         double rendimentoTotal = saldo + valorPoupado;

        System.out.println("Valor rendido: R$" + valorPoupado + "; total na poupança: R$" + rendimentoTotal);
    }
}
