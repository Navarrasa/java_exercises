package lista2;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o valor da Blusa que está comprando?");
       float valor_mercadoria = scanner.nextFloat();

       double valor_representante = valor_mercadoria * 0.20;
       double valor_impostos = valor_mercadoria * 0.30;


       double valor_venda = valor_mercadoria + valor_representante + valor_impostos;

        System.out.printf("""
                
                Dados da venda:
                
                Valor Bruto da Blusa: R$%.2ff
                
                Valor do Representante: R$%.2ff
                
                Valor dos Impostos: R$%.2ff
                
                Valor Total: R$%.2ff
                """,valor_mercadoria, valor_representante, valor_impostos, valor_venda);
    }
}
