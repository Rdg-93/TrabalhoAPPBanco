package br.com.letscode.model;

public class ContaPoupanca implements Conta{

    private static int Nconta = 1;
    private Cliente cliente;

    private double saldo;


    public ContaPoupanca(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getNconta() {
        return Nconta;
    }


    @Override
    public int abrirConta() {
        return Nconta++;
    }

    @Override
    public double sacar(double valor) {
        if(temSaldo(valor)){
            this.saldo-=valor;
            return saldo;
        }
        return saldo;
    }

    @Override
    public double depositar(double valor) {
        return this.saldo += valor;
    }

    @Override
    public double transferencia(double valor, Conta contaDestino) {
        if (temSaldo(valor)){
            sacar(valor);
            contaDestino.depositar(valor);
            return this.saldo;
        }
        return this.saldo;
    }

    @Override
    public double investir(double valor) {
        return saldo += valor;
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }
    private boolean temSaldo(double valor){
        if (saldo >= valor){
            return true;
        }
        throw new ContaException("Saldo insuficiente");
    }

    public String getNome() {
        return cliente.getNome();
    }
}
