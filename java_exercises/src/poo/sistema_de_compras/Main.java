package poo.sistema_de_compras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para ler entrada do usuário pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Criação de um novo carrinho de compras
        Carrinho carrinho = new Carrinho();

        // Produtos disponíveis na loja
        Produto maca = new Produto("Maçã Fresca", 10.99, 10.0);
        Produto banana = new Produto("Banana", 14.99, 10.0);
        Produto melancia = new Produto("Melancia", 19.99, 10.0);

        // Boas-vindas e início do cadastro
        System.out.println("Seja bem-vindo(a) à nossa loja!");
        System.out.println("Deseja se cadastrar? (sim/nao)");
        String opcao = scanner.nextLine().toLowerCase();

        // Verifica se o usuário quer se cadastrar
        if (!opcao.equals("sim")) {
            System.out.println("Que pena, apenas clientes cadastrados podem comprar aqui :(");
            System.out.println("Por favor, volte quando estiver cadastrado!");
            return; // encerra o programa
        }

        // Coleta nome e email do cliente para o cadastro
        System.out.println("Que bom! Vamos te cadastrar então!");
        System.out.println("Qual o seu nome?");
        String nome_cliente = scanner.nextLine();
        System.out.println("Qual o seu email?");
        String email_cliente = scanner.nextLine();

        // Criação e exibição dos dados do cliente
        Cliente cliente = Cliente.criarCliente(email_cliente, nome_cliente);
        cliente.mostrarDados(cliente);

        // Loop principal do menu de compras
        while (true) {
            // Exibe as opções para o usuário
            System.out.println("\nEscolha um produto para adicionar:");
            System.out.println("1. Maçã Fresca");
            System.out.println("2. Banana");
            System.out.println("3. Melancia");
            System.out.println("4. Deletar Produto");
            System.out.println("5. Mostrar Carrinho");
            System.out.println("6. Finalizar Compra / Sair");
            System.out.print("Digite o número da opção: ");

            int user_opcao;

            // Tratamento de erro caso o usuário digite algo que não seja número
            try {
                user_opcao = scanner.nextInt();
                scanner.nextLine(); // consome a quebra de linha pendente
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.nextLine(); // limpa o buffer
                continue; // volta ao início do loop
            }

            // Ações de acordo com a opção escolhida
            switch (user_opcao) {
                // Casos 1 a 3: Adicionar produto ao carrinho
                case 1, 2, 3 -> {
                    System.out.print("Digite a quantidade (unidade): ");
                    int quantidade;
                    try {
                        quantidade = scanner.nextInt();
                        scanner.nextLine(); // consome a quebra de linha
                    } catch (Exception e) {
                        System.out.println("Quantidade inválida. Use apenas números.");
                        scanner.nextLine(); // limpa o buffer
                        continue;
                    }

                    // Adiciona o produto correspondente
                    switch (user_opcao) {
                        case 1 -> carrinho.adicionarProduto(maca, quantidade);
                        case 2 -> carrinho.adicionarProduto(banana, quantidade);
                        case 3 -> carrinho.adicionarProduto(melancia, quantidade);
                    }
                }

                // Caso 4: Remover produto do carrinho
                case 4 -> carrinho.deletarProduto(scanner);

                // Caso 5: Exibir itens do carrinho
                case 5 -> carrinho.mostrarCarrinho();

                // Caso 6: Finalizar compra
                case 6 -> {
                    System.out.println("\nItens no carrinho:");
                    carrinho.mostrarResumo(); // mostra resumo com desconto
                    System.out.printf("Total: R$ %.2f%n", carrinho.calcularTotal());
                    System.out.println("Obrigado por comprar conosco!");
                    return; // encerra o programa
                }

                // Opção inválida
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
