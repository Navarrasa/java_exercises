package lista4;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//      Criando algumas listas
        String[] nome = new String[10];
        float[] altura = new float[10];
        float[] peso = new float[10];

//      Neste for, estou pedindo o input do usuário de acordo com a posição i da pessoa, e adicionando
//      esse valor nas listas
        for (int i = 1; i < 7; i++) {

            System.out.println("Qual o nome da "+  i + "a pessoa?");
            String nome_pessoa = scanner.next();
            System.out.println("Qual a altura dessa pessoa? ");
            float altura_pessoa = scanner.nextFloat();
            System.out.println("Qual o peso da pessoa? ");
            float peso_pessoa = scanner.nextFloat() ;

            nome[i] = nome_pessoa;
            altura[i] = altura_pessoa;
            peso[i] = peso_pessoa;
        }
//      Variáveis para comparação entre listas
        float maior_peso = 0;
        float maior_altura = 0;

//      Neste bloco de código, estou alterando os valores das variáveis de comparação,
//      para os maiores valores da lista
        for (int i = 1; i < 7; i++){

            if (altura[i] > maior_altura){
                maior_altura = altura[i];
            }
            if (peso[i] > maior_peso){
                maior_peso = peso[i];
            }

        }
//      Neste bloco de código for abaixo, estou comparando os maiores valores com cada posição i nas listas
//      Quando o valor for encontrado, eu puxo todas as listas da mesma posição no output
        for (int i = 1; i < 7; i++){

            if (peso[i] == maior_peso){
                System.out.printf("""
                        Chamando a pessoa mais pesada!
                        Nome: %s
                        Peso: %.2f
                        """,nome[i],peso[i]);
            }

            if (altura[i] == maior_altura){
                System.out.printf("""
                        Chamando a pessoa mais alta!
                        Nome: %s
                        Altura: %.2f
                        """,nome[i],altura[i]);
            }
        }
    }
}
