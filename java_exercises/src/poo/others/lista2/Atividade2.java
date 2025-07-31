package lista2;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scanner.nextInt();


        System.out.println("Digite outro número:");
        int numero2 = scanner.nextInt();

        System.out.println("A soma dos dois números é: " + (numero1 + numero2));

        System.out.println("A subtração do primeiro pelo segundo resulta: "+ (numero1 - numero2));

        System.out.println("A multiplicação dos números resulta: "+(numero1*numero2));

        if (numero2 == 0){
            System.out.println("Essa divisão não pode ser efetuada, o segundo número é 0");
        }
        else {
            System.out.println("A divisão do primeiro número pelo segundo resulta: " + (numero1 / numero2));
        }
        System.out.println("O primeiro número elevado ao segunda resulta em: "+Math.pow(numero1,numero2));

        System.out.println("O resto da divisão do primeiro número pelo segunda é: "+numero1%numero2);
    }
}
