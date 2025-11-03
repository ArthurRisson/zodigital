package br.edu.atitus.arthur_risson.zoo_digital.animais;

public abstract class Animal {
    private static int contador = 0;

    private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
        Animal.contador++;
    }

    public static int getContador() {
        return contador;
    }

    public abstract void emitirSom();
    public abstract void comer();


    public final String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("Espécie não pode ser vazia");
        }
        this.especie = especie;
    }
    @Override
    public String toString() {
        return String.format("Nome: %s | Espécie: %s", getNome(), getEspecie());
    }
}