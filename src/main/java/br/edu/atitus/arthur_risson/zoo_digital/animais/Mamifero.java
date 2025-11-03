package br.edu.atitus.arthur_risson.zoo_digital.animais;

public abstract class Mamifero extends Animal {
    private boolean temPelo;
    private double temperaturaCorporal;
    private boolean gestante;

    public Mamifero(String nome, boolean temPelo) {
        super(nome, "Mamífero");
        this.temPelo = temPelo;
        this.temperaturaCorporal = 37.0;
        this.gestante = false;
    }

    public boolean isTemPelo() {
        return temPelo;
    }

    public void setTemPelo(boolean temPelo) {
        this.temPelo = temPelo;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperatura) {
        if (temperatura < 35.0 || temperatura > 42.0) {
            System.out.println("ATENÇÃO: Temperatura corporal anormal!");
        }
        this.temperaturaCorporal = temperatura;
    }

    public boolean isGestante() {
        return gestante;
    }

    public void setGestante(boolean gestante) {
        this.gestante = gestante;
        if (gestante) {
            System.out.println(getNome() + " está esperando filhotes!");
        }
    }

    public void amamentar() {
        if (gestante) {
            System.out.println(getNome() + " ainda está gestante e não pode amamentar.");
        } else {
            System.out.println(getNome() + " está amamentando seu filhotinho.");
        }
    }

    public void regularTemperatura() {
        System.out.println(getNome() + " está regulando sua temperatura corporal.");
    }
}