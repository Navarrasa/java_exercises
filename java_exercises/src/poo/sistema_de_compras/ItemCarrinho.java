package poo.sistema_de_compras;

public class ItemCarrinho {
    private final Produto produto;
    private final int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public double getDesconto() {
        return produto.getPreco() * produto.getDesconto() / 100;
    }

    public double getTotalComDesconto() {
        return getSubtotal() - getDesconto();
    }
}
