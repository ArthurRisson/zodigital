package br.edu.atitus.arthur_risson.zoo_digital.animais;

import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Predador;

public class Python extends Reptil implements Predador {
    public Python(String nome) {
        super(nome, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando ameaçadoramente!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando usando constrição!");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está engolindo sua presa inteira.");
    }
}