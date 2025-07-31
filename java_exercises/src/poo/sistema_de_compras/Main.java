package poo.sistema_de_compras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        Produto maca = new Produto("Maçã Fresca", 10.99, 10.0);
        Produto banana = new Produto("Banana", 14.99, 10.0);
        Produto melancia = new Produto("Melancia", 19.99, 10.0);

        while (true) {
            System.out.println("Seja bem vindo(a) à nossa loja!");
            System.out.println("Deseja se cadastrar? (sim/nao)");
            String opcao = scanner.nextLine().toLowerCase();
            if (!opcao.equals("sim")){
                System.out.println("Que pena, apenas clientes cadastrados podem comprar aqui :(");
                break;
            }
            else{
                System.out.println("Que bom! vamos te cadastrar então!");

            }

            System.out.println("\nEscolha um produto para adicionar:");
            System.out.println("1. Maçã Fresca");
            System.out.println("2. Banana");
            System.out.println("3. Melancia");
            System.out.println("4. Finalizar");

            int opcao = scanner.nextInt();
            if (opcao == 4) break;

            System.out.print("Digite a quantidade (em kg): ");
            int quantidade = scanner.nextInt();

            switch (opcao) {
                case 1 -> carrinho.adicionarProduto(maca, quantidade);
                case 2 -> carrinho.adicionarProduto(banana, quantidade);
                case 3 -> carrinho.adicionarProduto(melancia, quantidade);
                case 4 -> mostrarCarrinho()
                default -> System.out.println("Opção inválida.");
            }
        }

        System.out.println("\nItens no carrinho:");
        carrinho.mostrarResumo();
        System.out.printf("Total: R$ %.2f%n", carrinho.calcularTotal());
    }
}
