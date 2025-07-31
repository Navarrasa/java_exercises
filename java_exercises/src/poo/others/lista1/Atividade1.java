package lista1;

import java.util.Scanner;

public class Atividade1 {

    public static void Main(String[] args) {

        // Programa que lê uma temperatura em Graus Farenheit e converte para Celsius

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os graus farenheit necessários para converter:");

        float entrada_usuario = scanner.nextFloat();

        float formula_farenheit_para_celsius = (entrada_usuario - 32) * 5/9;

        System.out.println("A conversão resulta em: " +formula_farenheit_para_celsius);

    }

}
