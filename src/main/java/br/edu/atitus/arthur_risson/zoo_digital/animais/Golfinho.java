package br.edu.atitus.arthur_risson.zoo_digital.animais;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Predador;

public class Golfinho extends Mamifero implements Nadador, Predador {

    public Golfinho(String nome) {
        super(nome, false);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() +  " está assoviando");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando peixe, lula ou polvo");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixinhos");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em mar aberto");
    }
}