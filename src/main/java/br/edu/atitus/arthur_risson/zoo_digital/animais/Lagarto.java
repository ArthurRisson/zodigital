package br.edu.atitus.arthur_risson.zoo_digital.animais;

import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Predador;

public class Lagarto extends Reptil implements Corredor, Predador {
    public Lagarto(String nome) {
        super(nome, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo um som suave!");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo rapidamente entre as rochas!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos insetos!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pequenos insetos.");
    }
}