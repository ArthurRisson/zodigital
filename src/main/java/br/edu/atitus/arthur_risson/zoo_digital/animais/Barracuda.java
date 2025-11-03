package br.edu.atitus.arthur_risson.zoo_digital.animais;

import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Predador;

public class Barracuda extends Peixe implements Nadador, Predador {
    public Barracuda(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo bolhas na água!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando velozmente!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando peixes menores em alta velocidade!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes menores que captura.");
    }
}