package br.com.zup.Restaurante;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //opções
    public static void menu() {
        System.out.println("*** RESTAURANTE TEMPERO DE MAINHA ***");
        System.out.println("Digite 1 - Para cadastrar um prato.");
        System.out.println("Digite 2 - Para exibir o Cardápio.");
        System.out.println("Digite 3 - Para sair do Restaurante.");

    }
    //cadastrar pratos
    public static Prato cadastrarPrato(){
        String nome = capturarDados ("Digite o nome do prato: ").nextLine();
        double valor = capturarDados("Digite o valor do prato R$: ").nextDouble();
        Prato pratos = new Prato(nome, valor);
        return pratos;
    }
    public static Ingrediente cadastrarIngrediente(){
        String nome = capturarDados("Digite o Ingrediente: ").nextLine();
        Ingrediente ingrediente = new Ingrediente(nome);
        return ingrediente;
    }
    //executando as opções
    public static void Executar(){
        boolean menu = true;
        Cardápio cardapio = new Cardápio();

        while (menu){
            menu();
            int opcaoDesejada = capturarDados("Digite a opção que deseja: ").nextInt();

            //navegando pelo menu
            if (opcaoDesejada == 1){
                Prato pratoNovo = cadastrarPrato();
                cardapio.addPrato(pratoNovo);

                //submenu para adicionar mais de um ingrediente ao prato
                    int opcao = capturarDados("Digite a quantidade de ingredientes que deseja: ").nextInt();
                for (int i = 0; i < opcao; i++) {
                    Ingrediente ingrediente = cadastrarIngrediente();
                    pratoNovo.addIngrediente(ingrediente);
                    //System.out.println(pratoNovo);
                }
            } else if (opcaoDesejada == 2){
                System.out.println(cardapio);
            }else if (opcaoDesejada == 3){
                System.out.println("Até mais!");
                menu = false;
            }
        }
    }
}
