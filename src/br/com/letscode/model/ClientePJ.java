package br.com.letscode.model;

public class ClientePJ extends Cliente {

    public ClientePJ(String nome, String documento) {
        super(nome, documento, Pessoa.JURIDICA);
    }
}
