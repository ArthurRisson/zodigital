package br.edu.atitus.arthur_risson.zoo_digital.comportamentos;

public interface Corredor {
    void correr();
    
    default void andar() {
        System.out.println("Andando calmamente...");
    }
    
    default void saltar() {
        System.out.println("Saltando obstáculos...");
    }
    
    default void desacelerar() {
        System.out.println("Diminuindo a velocidade...");
    }
}
