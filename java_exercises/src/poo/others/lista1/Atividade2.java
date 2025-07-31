package lista1;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        // Um programa que lê a temperatura em Graus Celsius e converta para Farenheit

        // (IMPORTANDO) Classe Scanner - lê um input do usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor em graus Celsius e vamos converter para Farenheit:");

        // Variável para armazenar o input do usuario

        float entrada_usuario = scanner.nextFloat();

        float formula_celsius_para_farenheit = (entrada_usuario * 9/5) + 32;

        System.out.println("A conversão de Celsius para Farenheit é: " +formula_celsius_para_farenheit);


    }


}
