package desafios;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

//        Elabore um programa Java que utilize o operador ternário
//        para verificar se um número está dentro de um intervalo específico (por exemplo, entre 10 e 20)

        Scanner scanner = new Scanner(System.in);

        int numero;
//        Recebendo um número inteiro
        System.out.println("Digite um número, e vamos verificar em que intervalo ele se encontra!");
        numero = scanner.nextInt();
//        Verificando se o número se encontra entre o intervalo de 10 e 20, e mostrando seus devidos outputs
//        Operador ternário com comparações AND (&&).
        System.out.println((numero >= 10 && numero <= 20) ? "Dentro do Intervalo!" : "Fora do Intervalo!");
        System.out.println("O intervalo se encontra entra 10 e 20!");
    }
}
