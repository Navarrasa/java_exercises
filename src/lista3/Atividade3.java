package lista3;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos Gols fez o Santos?");
        int timeA = scanner.nextInt();

        System.out.println("Quantos Gols fez o Barcelona?");
        int timeB = scanner.nextInt();


        if (timeA > timeB){
            System.out.println("O Santos possui mais Gols!");
        } else if (timeA == timeB) {
            System.out.println("Ambos possuem a mesma quantidade de Gols!");
        }
        else {
            System.out.println("O Barcelona possui mais Gols!");
        }

    }

}
