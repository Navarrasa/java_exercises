package lista2;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = scanner.nextInt();

        System.out.println("O sucessor do seu número é: "+(numero+1));

        System.out.println("O antecessor do seu número é: "+(numero-1));

    }
}
