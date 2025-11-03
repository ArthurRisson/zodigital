package br.edu.atitus.arthur_risson.zoo_digital.animais;

import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Predador;

public class Leao extends Mamifero implements Corredor, Predador {
    public Leao(String nome) {
        super(nome, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo!");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás de uma presa!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando uma zebra na savana!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sua caça.");
    }
}