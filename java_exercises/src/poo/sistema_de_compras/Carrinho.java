package poo.sistema_de_compras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private final List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarProduto(Produto produto, int quantidade) {
        itens.add(new ItemCarrinho(produto, quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

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

    public void mostrarCarrinho() {
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
