package br.com.letscode.application;

import br.com.letscode.model.*;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        Cliente cliente = new ClientePJ("Cleitin","123878957-43");
        Cliente cliente2 = new ClientePF("ABC","123456789-12");
        Conta conta = ContaFactory.criarContaInvestimento(cliente);
        Conta conta2 = ContaFactory.criarContaCorrente(cliente2);
        int i = conta.abrirConta();
        System.out.println("O Numero da conta e:" + i);
        int e = conta2.abrirConta();
        System.out.println("O Numero da conta e:" + e);
        banco.adicionaConta(conta);
        banco.adicionaConta(conta2);
        System.out.println("Os Clientes do banco são : " + banco.listar());
        double s = conta.investir(200.00);
        System.out.println("O Saldo agora e :" + s);
        double c = conta2.investir(100.00);
        System.out.println("O Saldo agora e :" + c);
        double t = conta.transferencia(50.0,conta2);
        System.out.println("O Saldo agora e :" + t);
        double r = conta.sacar(50.00);
        System.out.println("O Saldo agora e :" + r);
        System.out.println("O saldo total e : " + conta2.consultarSaldo());
        System.out.println("O saldo total e : " + conta.consultarSaldo());

    }
}
