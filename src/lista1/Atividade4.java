package lista1;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        System.out.println("Digite um número");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        System.out.println("Retornando o Cubo e Quadrado do número:");
        System.out.println("Cubo: " +Math.pow(numero,3));
        System.out.println("Quadrado: " +Math.pow(numero,2));


    }

}
