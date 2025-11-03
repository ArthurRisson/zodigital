package br.edu.atitus.arthur_risson.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import br.edu.atitus.arthur_risson.zoo_digital.animais.*;


import br.edu.atitus.arthur_risson.zoo_digital.comportamentos.*;

public class ZooDigitalApp {
    private static final List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== BEM-VINDO AO ZOO VIRTUAL ===");
            System.out.println("1. Adicionar animal ao acervo");
            System.out.println("2. Mostrar animais cadastrados");
            System.out.println("3. Mostrar animais corredores");
            System.out.println("4. Mostrar animais nadadores");
            System.out.println("5. Mostrar animais voadores");
            System.out.println("6. Mostrar animais predadores");
            System.out.println("7. Ver total de animais");
            System.out.println("0. Encerrar programa");
            System.out.print("Escolha uma opção (número): ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarNovoAnimal(sc);
                case 2 -> listarTodosAnimais();
                case 3 -> listarTodosCorredores();
                case 4 -> listarTodosNadadores();
                case 5 -> listarTodosVoadores();
                case 6 -> listarTodosPredadores();
                case 7 -> exibirTotalDeAnimais();
                case 0 -> {
                    System.out.println("Saindo... Obrigado por visitar o Zoo Virtual.");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente escolhendo uma opção válida.");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void cadastrarNovoAnimal(Scanner sc) {
        System.out.println("\n== Cadastro de novo Animal ==");
        System.out.println("Classes Biológicas:");
        System.out.println("1 - Mamífero");
        System.out.println("2 - Ave");
        System.out.println("3 - Peixe");
        System.out.println("4 - Réptil");
        System.out.print("== Digite a classe: ");
        int grupo = sc.nextInt();
        sc.nextLine();

    System.out.print("Nome do novo Animal: ");
    String nome = sc.nextLine();

        Animal novoAnimal = null;

        switch (grupo) {
            
        
            case 1 -> {
                System.out.println("\nMamíferos:");
                System.out.println("1 - Cachorro");
                System.out.println("2 - Golfinho");
                System.out.println("3 - Leão");
                System.out.println("4 - Baleia");
                System.out.print("== Escolha uma das opções: ");
                int tipoMamifero = sc.nextInt();
                sc.nextLine();

                switch (tipoMamifero) {
                    case 1 -> {
                        System.out.print("Raça do cachorro: ");
                        String raca = sc.nextLine();
                        novoAnimal = new Cachorro(nome, raca);
                    }
                    case 2 -> novoAnimal = new Golfinho(nome);
                    case 3 -> novoAnimal = new Leao(nome);
                    case 4 -> novoAnimal = new Baleia(nome);
                    default -> System.out.println("Tipo inválido de mamífero!");
                }
            }

            
            case 2 -> {
                System.out.println("\nAves:");
                System.out.println("1 - Falcão");
                System.out.println("2 - Pavão");
                System.out.println("3 - Pato");
                System.out.println("4 - Pinguim");
                System.out.print("== Escolha uma das opções: ");
                int tipoAve = sc.nextInt();
                sc.nextLine();

                System.out.print("Cor das penas: ");
                String corPenas = sc.nextLine();

                switch (tipoAve) {
                    case 1 -> novoAnimal = new Falcao(nome, corPenas);
                    case 2 -> novoAnimal = new Pavao(nome, corPenas);
                    case 3 -> novoAnimal = new Pato(nome, corPenas);
                    case 4 -> novoAnimal = new Pinguim(nome, corPenas);
                    default -> System.out.println("Tipo inválido de ave!");
                }
            }

            
            case 3 -> {
                System.out.println("\nPeixes:");
                System.out.println("1 - Barracuda");
                System.out.println("2 - Traíra");
                System.out.println("3 - Peixe Morcego");
                System.out.println("4 - Cavalo Marinho");
                System.out.print("== Escolha uma das opções: ");
                int tipoPeixe = sc.nextInt();
                sc.nextLine();

                switch (tipoPeixe) {
                    case 1 -> novoAnimal = new Barracuda(nome);
                    case 2 -> novoAnimal = new Traira(nome);
                    case 3 -> novoAnimal = new PeixeMorcego(nome);
                    case 4 -> novoAnimal = new CavaloMarinho(nome);
                    default -> System.out.println("Tipo inválido de peixe!");
                }
            }

            
            case 4 -> {
                System.out.println("\nRépteis:");
                System.out.println("1 - Python");
                System.out.println("2 - Lagarto");
                System.out.println("3 - Crocodilo");
                System.out.println("4 - Iguana");
                System.out.print("== Escolha uma das opções: ");
                int tipoReptil = sc.nextInt();
                sc.nextLine();

                switch (tipoReptil) {
                    case 1 -> novoAnimal = new Python(nome);
                    case 2 -> novoAnimal = new Lagarto(nome);
                    case 3 -> novoAnimal = new Crocodilo(nome);
                    case 4 -> novoAnimal = new Iguana(nome);
                    default -> System.out.println("Tipo inválido de réptil!");
                }
            }

            default -> System.out.println("Grupo inválido!");
        }

        if (novoAnimal != null) {
            animais.add(novoAnimal);
            System.out.println("\n Animal cadastrado com sucesso!");
        } else {
            System.out.println("\nCadastro cancelado.");
        }
    }

    private static void listarTodosAnimais() {
        System.out.println("\n== Lista de todos os animais ==");
        for (Animal a : animais) {
            System.out.println(a);
            a.emitirSom();
            a.comer();
            System.out.println("------------------");
        }
    }

    private static void listarTodosCorredores() {
        System.out.println("\n== Animais corredores ==");
        for (Animal a : animais) {
            if (a instanceof Corredor c) {
                System.out.println(a);
                c.correr();
                System.out.println("------------------");
            }
        }
    }

    private static void listarTodosNadadores() {
        System.out.println("\n== Animais nadadores ==");
        for (Animal a : animais) {
            if (a instanceof Nadador n) {
                System.out.println(a);
                n.nadar();
                System.out.println("------------------");
            }
        }
    }

    private static void listarTodosVoadores() {
        System.out.println("\n== Animais voadores ==");
        for (Animal a : animais) {
            if (a instanceof Voador v) {
                System.out.println(a);
                v.voar();
                System.out.println("------------------");
            }
        }
    }

    private static void listarTodosPredadores() {
        System.out.println("\n== Animais predadores ==");
        for (Animal a : animais) {
            if (a instanceof Predador p) {
                System.out.println(a);
                p.cacar();
                System.out.println("------------------");
            }
        }
    }

    private static void exibirTotalDeAnimais() {
        System.out.println("\nTotal de animais cadastrados no Zoo: " + Animal.getContador());
    }
}
