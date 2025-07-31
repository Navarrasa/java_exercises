package lista1;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor da base do triangulo:");
        float base_triangulo = scanner.nextFloat();
        System.out.println("Digite a altura do triangulo");
        float altura_triangulo = scanner.nextFloat();

        float area_triangulo = (base_triangulo * altura_triangulo) /2;

        System.out.println("A área do seu triângulo é: " +area_triangulo + "m");


    }

}
