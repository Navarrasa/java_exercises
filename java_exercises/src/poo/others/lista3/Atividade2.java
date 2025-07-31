package lista3;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto que é o valor desse produto x ? ");

        float valor_produto = scanner.nextFloat();

        System.out.println("E quantos você vai comprar? ");

        int quantidade_produto = scanner.nextInt();

        if (quantidade_produto <= 12) {
            float valor_total_produto = quantidade_produto * valor_produto;
            System.out.println("Perfeito, o total que deverá pagar é de: R$" +valor_total_produto);
        }
        else{
            double valor_total_produto = (valor_produto - valor_produto*0.10) * quantidade_produto;
            System.out.println("Perfeito, o total que deverá pagar é de: R$" +valor_total_produto);
        }
    }
}
