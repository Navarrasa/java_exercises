package TryCatch;

import java.util.Scanner;

public class Throw_New {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            if (idade < 10){
                throw new IllegalArgumentException("Erro: Idade mínima é de 18 anos. ");

            }

            System.out.println("Cadastro realizado com sucesso!");

        }catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada" + e.getMessage());
        }finally {
            scanner.close();
            System.out.println("Programa finalizado!");
        }

    }

}

