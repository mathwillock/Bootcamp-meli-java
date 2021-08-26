package com.company.polimorfismo;

public class PolimorfismoMain {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(4000);
        PolimorfismoMain.imprimirSaldo(conta);
        //--------------------------------------\
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(10000);
        imprimirSaldo(contaCorrente);
        //--------------------------------------\
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(2000);
//        imprimirSaldo(contaPoupanca);
        contaPoupanca.poupando();

    }


    public static void imprimirSaldo(Conta conta) {
        System.out.println("Saldo da conta: R$ " + conta.getSaldo());
    }
}
