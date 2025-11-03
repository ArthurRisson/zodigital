package br.edu.atitus.arthur_risson.zoo_digital.comportamentos;

public interface Predador {
    void cacar();
    default void rastrear() {
        System.out.println("Predador está rastreando sua presa...");
    }
    default void perseguir() {
        System.out.println("Predador está perseguindo sua presa!");
    }
    default void descansar() {
        System.out.println("Predador está descansando após a caçada.");
    }
}
