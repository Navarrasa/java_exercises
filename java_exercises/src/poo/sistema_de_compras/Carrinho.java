package poo.sistema_de_compras;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    // Lista para armazenar os itens do carrinho
    private final List<ItemCarrinho> itens = new ArrayList<>();

    // Scanner para leitura de entrada do usuário
    Scanner scanner = new Scanner(System.in);

    /**
     * Adiciona um produto ao carrinho com a quantidade especificada
     */
    public void adicionarProduto(Produto produto, int quantidade) {
        itens.add(new ItemCarrinho(produto, quantidade));
    }

    /**
     * Calcula o valor total bruto (sem desconto) do carrinho
     */
    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    /**
     * Mostra um resumo dos itens no carrinho, incluindo valores com e sem desconto
     */
    public void mostrarResumo() {
        for (ItemCarrinho item : itens) {
            System.out.printf("%s - R$ %.2f x %dkg = R$ %.2f%n | Com desconto: R$ %.2f%n",
                    item.getProduto().getNome(),
                    item.getProduto().getPreco(),
                    item.getQuantidade(),
                    item.getSubtotal(),
                    item.getTotalComDesconto());
        }
    }

    /**
     * Permite ao usuário deletar um produto do carrinho informando o nome
     */
    public void deletarProduto(Scanner scanner) {
        if (itens.isEmpty()) {
            System.out.println("Carrinho está vazio.");
            return;
        }

        System.out.println("Digite o nome do produto que deseja remover:");
        for (ItemCarrinho item : itens) {
            System.out.println("- " + item.getProduto().getNome());
        }

        String produtoNome = scanner.nextLine();

        boolean removido = itens.removeIf(item ->
                item.getProduto().getNome().equalsIgnoreCase(produtoNome));

        if (removido) {
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }


    /**
     * Exibe todos os itens atualmente no carrinho
     */
    public void mostrarCarrinho() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho está vazio.");
            return;
        }

        System.out.println("Itens no carrinho:");
        for (ItemCarrinho item : itens) {
            System.out.printf("%s - R$ %.2f x %dkg = R$ %.2f%n",
                    item.getProduto().getNome(),
                    item.getProduto().getPreco(),
                    item.getQuantidade(),
                    item.getSubtotal());
        }
    }
}
