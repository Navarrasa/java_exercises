package lista1;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        // Calculador de IMC

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular o seu IMC!");

        System.out.println("Qual a sua altura?");
        float altura = scanner.nextFloat();
        System.out.println("Qual o seu peso atualmente?");
        float peso = scanner.nextFloat();

        double IMC = peso / (Math.pow(altura,2));

        if (IMC < 18.5){
            System.out.println("Você se encaixa em : Magreza Extrema!");
        } else if (IMC > 18.5 && IMC < 24.9) {
            System.out.println("Você se encaixa em : Peso Normal!");
        } else if (IMC > 24.9 && IMC < 29.9) {
            System.out.println("Você se encaixa em : Sobrepeso!");
        } else if (IMC > 29.9 && IMC < 39.9) {
            System.out.println("Você se encaixa em : Obesidade!");
        }else{
            System.out.println("Você se encaixa em : Obesidade Grave!");
        }


    }

}
