package br.edu.atitus.arthur_risson.zoo_digital.animais;

import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Corredor;

public class Iguana extends Reptil implements Corredor {
    public Iguana(String nome) {
        super(nome, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando suavemente!");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo sobre as pedras quentes!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo plantas e frutas.");
    }
}