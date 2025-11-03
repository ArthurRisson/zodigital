package br.edu.atitus.arthur_risson.zoo_digital.comportamentos;

public interface Voador {
    void voar();
    
    default void planar() {
        System.out.println("Planando com as correntes de ar...");
    }
    
    default void pousar() {
        System.out.println("Pousando suavemente...");
    }
    
    default void alçarVoo() {
        System.out.println("Levantando voo...");
    }
}
