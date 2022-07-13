package br.com.letscode.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    List<Conta> contas = new ArrayList<Conta>();


    public boolean adicionaConta(Conta conta) {

        return contas.add(conta);
    }

    public List<Conta> getContas() {
        return this.contas;
    }


    public String listar() {
        String s = "";
        for (Conta conta : contas) {
            s += " " + conta.getNome() + "\n";
        }
        return s;

    }

}

