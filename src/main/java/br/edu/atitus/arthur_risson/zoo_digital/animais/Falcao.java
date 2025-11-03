package br.edu.atitus.arthur_risson.zoo_digital.animais;

import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Predador;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Voador;

public class Falcao extends Ave implements Voador, Predador {
    public Falcao(String nome, String corPenas) {
        super(nome, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um grito agudo!");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está planando em círculos no céu!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos roedores do alto!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando sua presa capturada no ar.");
    }
}