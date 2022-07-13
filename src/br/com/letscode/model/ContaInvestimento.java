package br.com.letscode.model;

public class ContaInvestimento implements Conta{

    private Cliente cliente;
    private static int Nconta = 1;

    private double saldo;

    public ContaInvestimento(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int abrirConta() {
        return Nconta++;
    }

    @Override
    public double sacar(double valor) {

        if(Pessoa.JURIDICA.equals(this.cliente.getPessoa())){
            return this.saldo-= valor + (valor * 0.005);
        }
        return this.saldo-=valor;
    }

    @Override
    public double depositar(double valor) {
        return this.saldo+=valor;
    }


    @Override
    public double transferencia(double valor, Conta contaDestino) {
      if (temSaldo(valor) && Pessoa.JURIDICA.equals(this.cliente.getPessoa())){
            sacar(valor + (valor * 0.005));
            contaDestino.depositar(valor);
            return this.saldo-= valor + (valor * 0.005);
      } else if (temSaldo(valor)) {
          sacar(valor);
          contaDestino.depositar(valor);
          return this.saldo-= valor;
      }
        return this.saldo;
    }

    @Override
    public double investir(double valor) {
        if(Pessoa.JURIDICA.equals(this.cliente.getPessoa())){
            return this.saldo+= valor + (valor * 0.02);
        }
        return this.saldo += valor;
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

    public String getNome(){
        return cliente.getNome();
    }


}
