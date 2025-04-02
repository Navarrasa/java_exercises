package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {

//        Contagem de vogais e consoantes: Desenvolva um programa que receba uma string como
//        entrada e conte o número de vogais e consoantes presentes na string

//        Scanner básico, para ler o input do usuário
        Scanner scanner = new Scanner(System.in);

//        Das linhas 21 à 26, estou criando uma lista(array) chamada "vogais", e adicionando 5 valores nela,
//        a,e,i,o,u.

        List<Character> vogais = new ArrayList<>();
        vogais.add('a');
        vogais.add('e');
        vogais.add('i');
        vogais.add('o');
        vogais.add('u');

//        Declarando a variável da palavra do usuário
        String palavra;
//        Inicializando a variável que contará o quantidade de vogais
        int quantidade_vogais = 0;

        System.out.println("Digite uma palavra");
//        Recebendo o valor da palavra
        palavra = scanner.nextLine();

//        Nesse bloco de código abaixo, estou no primeiro for, iterando a lista de vogais, e depois iterando
//        a palavra, comparando se as letras são iguais. Se sim, a variável quantidade_vogais, incrementa 1 de valor.
        for (char letra_vogal : vogais){
//            System.out.println(letra_vogal);
            for (int i=0; i<palavra.length(); i++) {
                char c = palavra.charAt(i);
                if (Objects.equals(c, letra_vogal)){
                    quantidade_vogais +=1;
                }
            }
        }
//        Output da contagem.
        System.out.println("Essa palavra tem " + quantidade_vogais + " vogais!");
    }
}
