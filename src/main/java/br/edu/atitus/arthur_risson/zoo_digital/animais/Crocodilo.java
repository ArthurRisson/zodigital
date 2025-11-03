package br.edu.atitus.arthur_risson.zoo_digital.animais;

import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Predador;

public class Crocodilo extends Reptil implements Nadador, Predador {
    public Crocodilo(String nome) {
        super(nome, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rosnando profundamente!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está deslizando silenciosamente na água!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando presas na margem do rio!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando sua presa.");
    }
}