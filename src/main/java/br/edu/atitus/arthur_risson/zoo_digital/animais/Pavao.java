package br.edu.atitus.arthur_risson.zoo_digital.animais;

import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Corredor;

public class Pavao extends Ave implements Corredor {
    public Pavao(String nome, String corPenas) {
        super(nome, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo seu chamado característico!");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo com sua cauda aberta!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de sementes e insetos.");
    }
}