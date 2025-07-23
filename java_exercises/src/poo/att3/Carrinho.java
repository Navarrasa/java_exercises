package poo.att3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {
    private final String name;
    private final double price;
    private final int quantity;

    // Lista "Carrinho de Compras"
    private final List<Carrinho> carrinhoDeCompras = new ArrayList<>();

    // Construtor
    public Carrinho(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Definindo método para criar um carrinho de compras
    public static Carrinho criarCarrinhodeCompras(String name, double price, int quantity){

        System.out.println("Qual dos itens a seguir deseja colocar em seu carrinho de compras?");

        System.out.println("Produto: Maça Fresca | Preço: 10,99kg");
        System.out.println("Produto: Banana      | Preço: 14,99kg");
        System.out.println("Produto: Melância    | Preço: 19,99kg");

        // Definindo um scanner para obter inputs do usuário
        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("Digite qual produto deseja.");

            scanner.nextLine();

        }catch (IllegalArgumentException e){
            System.out.println("Por favor, somente um dos três produtos listados.");
        }
        
    }

}
