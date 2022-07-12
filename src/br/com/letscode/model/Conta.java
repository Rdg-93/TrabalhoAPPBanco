package br.com.letscode.model;

public interface Conta {
    int abrirConta();

    double sacar(double valor);

    double depositar(double valor);

    double transferencia(double valor, Conta contaDestino);

    double investir(double valor);

    double consultarSaldo();

    String getNome();
}
