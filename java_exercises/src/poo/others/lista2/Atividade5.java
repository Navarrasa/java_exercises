package lista2;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o horário (apenas horas)");
        int hora = scanner.nextInt();
        System.out.println("Digite o horário (apenas minutos)");
        int minuto = scanner.nextInt();
        System.out.println("Digite o horário (apenas segundos)");
        int segundos = scanner.nextInt();

        System.out.printf("O horário atual é: %d:%d:%d",hora, minuto, segundos);
        System.out.println("O horário atual em segundos é: " + ((hora*3600) + (minuto*60) + segundos) + " segundos");
    }

}
