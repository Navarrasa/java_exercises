package lista2;

import java.util.Random;
import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota (0-100)");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite a segundo nota (0-100)");
        float nota2 = scanner.nextFloat();

        double peso1 = (nota1 * 0.4);
        double peso2 = (nota2 * 0.6);

        double media = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);
        System.out.println(peso1);
        System.out.println(peso2);
        System.out.printf("%.2f",media);

    }
}
