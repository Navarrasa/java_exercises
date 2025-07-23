package poo.att1;

import java.util.ArrayList;
import java.util.List;

// Construindo o objeto pai
public class Produto {
    // Atributos do objeto
    private final String name;
    private final double price;

    // Lista para armazenar os produtos
    private static final List<Produto> listaProdutos = new ArrayList<>();

    // Construtor
    public Produto(String name, double price){
        this.name = name;
        this.price = price;
    }

    // Método para criar produtos e adicionar eles na lista
    public static void criarProdutos(String name, double price){

        Produto novoProduto = new Produto(name, price);
        listaProdutos.add(novoProduto);

    }

    // Método para listar os produtos dentro da lista
    public static void listarProdutos(){

        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : listaProdutos) {
                System.out.println("Nome: " + p.name + ", Preço: " + p.price);
            }
        }

    }

    public static void main(String[] args) {

        criarProdutos("Banana",30.0);
        criarProdutos("Maça",20.0);
        criarProdutos("Pêra",10.0);
        listarProdutos();
    }

}
