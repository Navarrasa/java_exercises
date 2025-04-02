package lista3;

import java.util.Random;
import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {

        int chances = 3;
        while (chances > 0) {

            Scanner scanner = new Scanner(System.in);
            Random numero = new Random();

            int numero_sorteado = numero.nextInt(100);
            System.out.println(numero_sorteado);


            System.out.println("Tente adivinhar o número da sorte! Ele está entre 0 e 100");
            int adivinhacao = scanner.nextInt();

            if (adivinhacao == numero_sorteado) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou!");
                chances -= 1;
                System.out.println("Chances restantes: " + chances);
            }
        }
    }
}
