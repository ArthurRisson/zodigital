package br.edu.atitus.arthur_risson.zoo_digital.animais;

import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Nadador;

public class Baleia extends Mamifero implements Nadador {
    public Baleia(String nome) {
        super(nome, false);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está cantando no oceano!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando graciosamente nas profundezas!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de krill e pequenos peixes.");
    }
}