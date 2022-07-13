package br.com.letscode.model;

public class ClientePF extends Cliente{
    public ClientePF(String nome, String documento) {
        super(nome, documento, Pessoa.FISICA);
    }
}
