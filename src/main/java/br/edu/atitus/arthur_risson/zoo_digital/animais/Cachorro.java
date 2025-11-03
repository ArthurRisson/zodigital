package br.edu.atitus.arthur_risson.zoo_digital.animais;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.Predador;

public class Cachorro extends Mamifero implements Corredor, Nadador, Predador {

    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome, true);
        this.raca = raca;
    }

    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos mamíferos");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sua ração");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás da bolinha");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando estilo cachorrinho");
    }


    public String getRaca() {
        return raca;
    }
    
}