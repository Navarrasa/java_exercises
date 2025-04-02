package lista4;

import java.util.Random;
import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        Solicitando um número para retornar a tabuada
        System.out.println("Qual número devemos informar a tabuada?");
        int numero = scanner.nextInt();

//        Formando a tabuada
        for (int i = 0; i <= 10; i++){
            int total = numero * i;
//            Output da tabuada
            System.out.printf("%d x %d = %d\n",numero,i,total);
        }

    }
}
