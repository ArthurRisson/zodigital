package br.edu.atitus.arthur_risson.zoo_digital.comportamentos;

public interface Nadador {
    void nadar();
    
    default void mergulhar() {
        System.out.println("Mergulhando nas profundezas...");
    }
    
    default void boiar() {
        System.out.println("Boiando na superfície da água...");
    }
    
    default void emergir() {
        System.out.println("Emergindo para respirar...");
    }
}
