package br.edu.atitus.arthur_risson.zoo_digital.animais;

public abstract class Peixe extends Animal {
    private String tipoAgua; //Água doce ou salgada

    // Construtor simples — tipo de água desconhecido por padrão
    public Peixe(String nome) {
        super(nome, "Peixe");
        this.tipoAgua = "Desconhecido";
    }

    // Construtor com tipo de água explícito (ex: "Doce", "Salgada")
    public Peixe(String nome, String tipoAgua) {
        super(nome, "Peixe");
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

}