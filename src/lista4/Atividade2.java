package lista4;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//      Criando algumas listas
        int[] idade = new int[10];
        float[] altura = new float[10];
        float[] peso = new float[10];

//      Neste for, estou pedindo o input do usuário de acordo com a posição i da pessoa, e adicionando
//      esse valor nas listas
        for (int i = 0; i < 10; i++) {

            System.out.printf("Qual a idade da ", i + 1+"a pessoa?");
            int idade_pessoa = scanner.nextInt();
            System.out.println("Qual a altura dessa pessoa? ");
            float altura_pessoa = scanner.nextFloat();
            System.out.println("Qual o peso da pessoa? ");
            float peso_pessoa = scanner.nextFloat() ;

            idade[i] = idade_pessoa;
            altura[i] = altura_pessoa;
            peso[i] = peso_pessoa;

        }
//      Pequeno menu para maior interatividade
        System.out.println("""
                
                O que deseja fazer?
                
                a. Quantas tem idade acima de 50 anos
                b. Quantas tem altura acima de 1.60m
                c. Quantas tem peso abaixo de 80kg
                d. Sair do programa

                """);
//      Switch Case para melhor organização do código e output do que foi informado no menu
        String opcao_usuario = scanner.next();
        switch (opcao_usuario) {
            case "a": {
                int contador_idade = 0;

                for (int num : idade){
                    if (num > 50){
                        contador_idade++;
                    }
                }
                System.out.println("Quantidade de pessoas com idade acima de 50 anos: "+ contador_idade);
                break;
            }
            case "b": {
                int contador_altura = 0;

                for (float num : altura){
                    if (num > 1.60){
                        contador_altura++;
                    }
                }
                System.out.println("Quantidade de pessoas com altura acima de 1.60m\n: "+ contador_altura);
                break;
            }
            case "c": {
                int contador_negativos = 0;

                for (float num : peso) {
                    if (num < 80) {
                        contador_negativos++;
                    }
                }
                System.out.println("Quantidade de pessoas que tem peso abaixo de 80kg\n: " + contador_negativos);
                break;
            }
            case "d": {
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

