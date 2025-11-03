package br.edu.atitus.arthur_risson.zoo_digital.animais;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Predador;

public class PeixeMorcego extends Peixe implements Nadador, Predador {

    public PeixeMorcego(String nome) {
        super(nome, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos peixes e crustáceos");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pesquenas algas");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando elegantemente na lagoa");
    }

}