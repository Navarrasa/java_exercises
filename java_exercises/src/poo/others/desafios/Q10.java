package desafios;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

//        Crie um programa Java que use a classe Scanner para ler
//        dois números do usuário e determine qual deles é o menor, utilizando o método Math.min().

        Scanner scanner = new Scanner(System.in);
//        Recebendo o primeiro número
        System.out.println("Digite um número inteiro! ");
        int numero_um = scanner.nextInt();
//        Recebendo o segundo número
        System.out.println("Digite um outro número inteiro! ");
        int numero_dois = scanner.nextInt();

//        Verificando o menor número através do módulo Math e inserindo em uma variável
        int menor_numero = Math.min(numero_um,numero_dois);
//      Output do menor número
        System.out.println("O menor número é: "+menor_numero);

    }

}
