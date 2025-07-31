package desafios;

import java.util.Scanner;

public class desafio_arrays {

    public static void main(String[] args) {

        // Scanner para receber inputs do usuário
        Scanner scanner = new Scanner(System.in);

        // Definindo as três arrays que receberão 5 valores
        String[] nome = new String[5];
        double[] preco = new double[5];
        int[] qtde = new int[5];

        // Receber inputs do usuário 5 vezes
        for (int a = 0; a < 5; a++) {
            try {
                // Recebendo os valores da array nome:
                System.out.println("Insira um produto qualquer:");
                String produto_nome = scanner.nextLine();  // Lê o nome do produto
                nome[a] = produto_nome;

                // Recebendo os valores da array preco:
                System.out.println("Digite o valor do produto:");
                double produto_preco = scanner.nextDouble();  // Lê o preço
                if (produto_preco <= 0) {
                    // Preço que o usuário envia não pode ser 0 ou negativo
                    throw new ArithmeticException("O preço do produto não pode ser negativo!");
                }
                preco[a] = produto_preco;

                // Consumindo o newline após nextDouble()
                scanner.nextLine();  // Isso vai "consumir" o \n que sobra

                // Recebendo os valores da array qtde:
                System.out.println("Quantos produtos tem no estoque hoje?");
                int produto_qtde = scanner.nextInt();  // Lê a quantidade
                qtde[a] = produto_qtde;

                // Consumindo o newline após nextInt()
                scanner.nextLine();  // Isso vai "consumir" o \n que sobra

            } catch (Exception e) {
                // Enviando mensagem de erro
                System.out.println("Valor inválido! Tente novamente.");
                a--;  // Decrementando a variável para tentar a mesma iteração
            }
        }

        // Finalizando os tratamentos de erro.
        scanner.close();

        // Pequena interface
        System.out.println("|------------------VALORES------------------|\n");
        System.out.println("|Nome       |     Quantidade    | Preço|");
        double valor_total = 0;
        for (int a = 0; a < 5; a++){

            System.out.println(nome[a] + "                  " + qtde[a] + "      " + "R$"+preco[a]);
            // Somando todos os valores
            valor_total += qtde[a] * preco[a];
        }
        System.out.println("|-------------------------------------------|");
        System.out.println("Valor total do estoque: R$" + valor_total);

    }
}
