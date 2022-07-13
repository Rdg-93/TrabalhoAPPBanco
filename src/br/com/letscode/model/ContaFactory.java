package br.com.letscode.model;

public class ContaFactory {

    private ContaFactory() {

    }

    public static Conta criarContaPoupanca(Cliente cliente) {
        if (Pessoa.JURIDICA.equals(cliente.getPessoa())){
            throw new ContaException("Tipo de Conta Inválida para a Abertura");
        }
        return criarContaPoupança(cliente);
    }

    private static Conta criarContaPoupança(Cliente cliente){
        return new ContaPoupanca(cliente);
    }

    public static Conta criarContaCorrente(Cliente cliente){
        return new ContaCorrente(cliente);
    }

    public static Conta criarContaInvestimento(Cliente cliente){
        return new ContaInvestimento(cliente);
    }

}


