package lista2;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, confirme os seus dados para trabalhar aqui na Bosch!");

        System.out.println("Qual o seu nome?");
        String nome = scanner.next();
        System.out.println("Qual o seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Qual a sua data de nascimento?");
        String data_nasc = scanner.next();
        System.out.println("Qual a sua pretensão salarial?");
        float pretensao_salarial = scanner.nextFloat();
        System.out.println("Qual o seu grau de escolaridade?");
        String grau_de_instrucao = scanner.next();
        System.out.println("Você possui CNH? (Sim/Não)");
        String cnh = scanner.next();

        System.out.printf("""
                Dados confirmados:
                
                Nome: %s;
                Sobrenome: %s;
                Data de Nascimento: %s
                Pretensão Salarial: R$%.2f
                Grau de Instrução: %s
                CNH: %s
                """,nome, sobrenome, data_nasc, pretensao_salarial, grau_de_instrucao, cnh);
    }
}
