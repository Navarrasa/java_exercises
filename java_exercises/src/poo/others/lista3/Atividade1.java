package lista3;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");

        int entrada_usuario = scanner.nextInt();

        if (entrada_usuario <= 14) {
            System.out.println("Você se encaixa na classificação Criança!");
        }
        else if (entrada_usuario > 14 && entrada_usuario <= 17){
            System.out.println("Você se encaixa na classificação Adolescente!");
        }
        else if (entrada_usuario > 17 && entrada_usuario <= 30){
            System.out.println("Você se encaixa na classificação Adulto!");
        }
        else{
            System.out.println("Você se encaixa na classificação Idoso!");
        }
    }
}
