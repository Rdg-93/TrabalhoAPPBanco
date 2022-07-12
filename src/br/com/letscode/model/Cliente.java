package br.com.letscode.model;

public abstract class Cliente{

    private String nome, documento;

    private Pessoa pessoa;

    public Cliente(String nome, String documento, Pessoa pessoa) {
        this.nome = nome;
        this.documento = documento;
        this.pessoa = pessoa;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

}
