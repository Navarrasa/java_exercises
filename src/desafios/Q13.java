package desafios;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

//        Sistema de Desconto: Crie um programa que determine o desconto a ser
//        aplicado a uma compra com base no valor total da compra e no tipo de cliente
//        (comum, ouro, premium). Utilize a classe Scanner para
//        receber o valor da compra e o tipo de cliente. Utilize estruturas if e else if
//        para aplicar diferentes percentuais de desconto

        Scanner scanner = new Scanner(System.in);
        String tipo_cliente = "";
        double valor_total_compra, compra;

//        Pequeno menu
        System.out.println("""
            Bem vindo, querido cliente!
       \s
        Em qual dessas posições você se encaixa?
       \s
        1- Cliente Comum
        2- Cliente Ouro
        3- Cliente Premium
       \s
               \s""");

        int opcao_cliente = scanner.nextInt();

//        Tratativas de acordo com a opção do cliente
        switch (opcao_cliente){
            case 1:{
                System.out.println("Perfeito!");
                tipo_cliente = "cliente_comum";
                break;
            }
            case 2:{
                System.out.println("Perfeito!");
                tipo_cliente = "cliente_ouro";
                break;
            }
            case 3:{
                System.out.println("Perfeito!");
                tipo_cliente = "cliente_premium";
                break;
            }
            default:{
                System.out.println("Escolha entre 1 a 3...");
            }
        }
//       Recebendo o valor da compra
        System.out.println("Nos diga por gentileza o total do valor da sua compra em nossa loja.");
        compra = scanner.nextFloat();
//      Realizando as tratativas de preços dependendo do valor da compra do cliente, e mostrando o preço final.
        if (tipo_cliente.equals("cliente_comum")){
            valor_total_compra = compra - (compra * 0.10);
            System.out.println("Perfeito! Você é um Cliente Comum, então possui direito a 10% de desconto na compra!");
            System.out.printf("Sendo assim, o valor totaliza-se em R$%.2f", valor_total_compra);
        } else if (tipo_cliente.equals("cliente_ouro")) {
            valor_total_compra = compra - (compra * 0.20);
            System.out.println("Perfeito! Você é um Cliente Ouro, então possui direito a 20% de desconto na compra!");
            System.out.printf("Sendo assim, o valor totaliza-se em R$%.2f", valor_total_compra);
        }
        else {
            valor_total_compra = compra - (compra * 0.30);
            System.out.println("Perfeito! Você é um Cliente Premimu, então possui direito a 30% de desconto na compra!");
            System.out.printf("Sendo assim, o valor totaliza-se em R$%.2f", valor_total_compra);
        }
    }
}
