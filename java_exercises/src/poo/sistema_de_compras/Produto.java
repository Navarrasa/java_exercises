package poo.sistema_de_compras;

import java.util.ArrayList;
import java.util.List;

// Construindo o objeto pai
public class Produto {
    // Atributos do objeto
    private final String nome;
    private final double preco;
    private final double desconto;

    // Construtor
    public Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    // Lista para armazenar os produtos
    private static final List<Produto> listaProdutos = new ArrayList<>();

    // Método para criar produtos e adicionar eles na lista
    public static void criarProdutos(String name, double price, double desconto){

        Produto novoProduto = new Produto(name, price, desconto);
        listaProdutos.add(novoProduto);

    }

    // Método para listar os produtos dentro da lista
    public static void listarProdutos(){

        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : listaProdutos) {
                System.out.println("Nome: " + p.nome + ", Preço: " + p.preco + ", Desconto aplicado: " + p.desconto);
            }
        }

    }

    public static void main(String[] args) {

        criarProdutos("Banana",30.0, 10.0);
        criarProdutos("Maça",20.0, 10.0);
        criarProdutos("Pêra",10.0, 20.0);
        listarProdutos();
    }

}
