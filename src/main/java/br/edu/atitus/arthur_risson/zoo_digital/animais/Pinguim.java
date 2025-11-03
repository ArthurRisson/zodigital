package br.edu.atitus.arthur_risson.zoo_digital.animais;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Predador;

public class Pinguim extends Ave implements Nadador, Predador {

    public Pinguim(String nome, String corPenas) {
        super(nome, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando peixe ou lula");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando atrás de peixes ou lulas");
    }
    
}