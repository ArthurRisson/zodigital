package br.edu.atitus.arthur_risson.zoo_digital.animais;

import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Nadador;

public class CavaloMarinho extends Peixe implements Nadador {
    public CavaloMarinho(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo suaves bolhas!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando verticalmente de forma graciosa!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de pequenos crustáceos e plâncton.");
    }
}