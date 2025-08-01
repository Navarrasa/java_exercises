package poo.sistema_de_compras;

/**
 * Classe que representa um item dentro do carrinho de compras.
 * Armazena o produto e a quantidade, e permite calcular subtotal, desconto e total com desconto.
 */
public class ItemCarrinho {

    // Produto que foi adicionado ao carrinho
    private final Produto produto;

    // Quantidade (em kg) do produto no carrinho
    private final int quantidade;

    /**
     * Construtor da classe ItemCarrinho
     * @param produto Produto a ser adicionado
     * @param quantidade Quantidade (em kg) do produto
     */
    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /**
     * Retorna o produto associado a este item
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Retorna a quantidade (em kg) adicionada ao carrinho
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Calcula o subtotal (sem desconto) deste item
     * subtotal = preço do produto * quantidade
     */
    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    /**
     * Calcula o valor de desconto para este item
     * desconto = (preço * percentual de desconto) * quantidade
     */
    public double getDesconto() {
        return produto.getPreco() * produto.getDesconto() / 100 * quantidade;
    }

    /**
     * Calcula o valor total com desconto aplicado
     */
    public double getTotalComDesconto() {
        return getSubtotal() - getDesconto();
    }
}
