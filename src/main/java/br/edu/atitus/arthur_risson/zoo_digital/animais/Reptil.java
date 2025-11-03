package br.edu.atitus.arthur_risson.zoo_digital.animais;

public abstract class Reptil extends Animal {
    private boolean temEscamas;
    private boolean hibernando;
    private int diasDesdeUltimaTrocaPele;
    private double temperaturaAmbiente;

    public Reptil(String nome, boolean temEscamas) {
        super(nome, "Réptil");
        this.temEscamas = temEscamas;
        this.hibernando = false;
        this.diasDesdeUltimaTrocaPele = 0;
        this.temperaturaAmbiente = 25.0;
    }

    public boolean isTemEscamas() {
        return temEscamas;
    }

    public void setTemEscamas(boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    public boolean isHibernando() {
        return hibernando;
    }

    public void iniciarHibernacao() {
        this.hibernando = true;
        System.out.println(getNome() + " entrou em estado de hibernação.");
    }

    public void despertarHibernacao() {
        this.hibernando = false;
        System.out.println(getNome() + " despertou da hibernação.");
    }

    public void trocarPele() {
        if (diasDesdeUltimaTrocaPele < 30) {
            System.out.println(getNome() + " ainda não está pronto para trocar de pele.");
            return;
        }
        System.out.println(getNome() + " está trocando de pele.");
        diasDesdeUltimaTrocaPele = 0;
    }

    public void ajustarTemperaturaCorporal() {
        if (temperaturaAmbiente < 15.0) {
            System.out.println(getNome() + " precisa se aquecer!");
            iniciarHibernacao();
        } else if (temperaturaAmbiente > 40.0) {
            System.out.println(getNome() + " precisa se refrescar!");
            buscarSombra();
        }
    }

    public void setTemperaturaAmbiente(double temperatura) {
        this.temperaturaAmbiente = temperatura;
        ajustarTemperaturaCorporal();
    }

    private void buscarSombra() {
        System.out.println(getNome() + " está procurando um local sombreado.");
    }

    public void passarDia() {
        diasDesdeUltimaTrocaPele++;
        if (diasDesdeUltimaTrocaPele >= 30) {
            System.out.println(getNome() + " está pronto para trocar de pele!");
        }
    }
}