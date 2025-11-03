package br.edu.atitus.arthur_risson.zoo_digital.animais;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Predador;

public class Traira extends Peixe implements Nadador, Predador {

    public Traira(String nome) {
        super(nome, "Doce");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos peixes, rãs e insetos");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo lambaris");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio");
    }
    
}  