package lista2;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario = 1500.00;
        double comissao = 350.00;
        double valor_comissao = 0.001;

        System.out.println("Olá Vendedor, qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Quantos carros você vendeu?");
        int carros_vendidos = scanner.nextInt();

        System.out.println("Qual o mês de hoje?");
        String mes = scanner.next();

        System.out.println("Qual o preço total de vendas desse mês?");
        double total_vendas = scanner.nextFloat();

        double salario_liquido = (salario + (comissao * carros_vendidos) + (total_vendas * valor_comissao));

        System.out.printf("""
                
                Dados de fim de Mês:
                
                Nome do Vendedor: %s
                Mês: %s
                
                Números de Carros vendidos: %d
                
                Valor total de Vendas: R$%.2f
                
                Salário Líquido: R$%.2f
                
                """,nome, mes, carros_vendidos, total_vendas, salario_liquido);
    }
}
