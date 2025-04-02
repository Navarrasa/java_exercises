package lista4;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int incremento;
//      Recebendo incremento e número para criarmos o loop
        System.out.println("Digite um número");
        numero = scanner.nextInt();
        System.out.println("Agora um incremento");
        incremento = scanner.nextInt();
//      printando o loop
        for (int i = 0; i <= numero; i+= incremento){
            System.out.println(i);
        }
    }
}
