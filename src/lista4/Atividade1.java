package lista4;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//      Criando uma pequena lista
        int[] numeros = new int[10];
//      Neste bloco de código, eu solicito os dados e eles são adicionados a posição i na lista
        for (int i = 0; i < 10; i++) {

            System.out.printf("Digite o %d numero ", i + 1);
            int numero = scanner.nextInt();

            numeros[i] = numero;
            System.out.println(numeros[i]);

        }
//      Pequeno menu para maior interatividade
        System.out.println("""
                
                O que deseja fazer?
                
                a. Quantos números pares?
                b. Quantos números ímpares?
                c. Quantos negativos?
                d. Quantos positivos?
                e. Sair do programa

                """);
//      Switch case para dar o output esperado no menu
        String opcao_usuario = scanner.next();
        switch (opcao_usuario) {
            case "a": {
                int contador_pares = 0;

                for (int num : numeros){
                    if (num % 2 == 0){
                        contador_pares++;
                    }
                }
                System.out.println("Quantidade de números pares: "+ contador_pares);
                break;
            }
            case "b": {
                int contador_impares = 0;

                for (int num : numeros){
                    if (num % 2 != 0){
                        contador_impares++;
                    }
                }
                System.out.println("Quantidade de números ímpares: "+ contador_impares);
                break;
            }
            case "c": {
                int contador_negativos = 0;

                for (int num : numeros){
                    if (num < 0){
                        contador_negativos++;
                    }
                }
                System.out.println("Quantidade de números ímpares: "+ contador_negativos);
                break;
            }
            case "d": {
                int contador_positivos = 0;

                for (int num : numeros){
                    if (num > 0){
                        contador_positivos++;
                    }
                }
                System.out.println("Quantidade de números ímpares: "+ contador_positivos);
                break;
            }
            case "e": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Opção inválida.");
                break;
            }
        }
    }
}

