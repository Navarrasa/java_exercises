package lista3;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, deseja a questão 1 ou 2?");
        int alt = scanner.nextInt();
        if (alt == 1){
            System.out.println("Aqui vai a questão 1:");
            System.out.println("""
                Boas vindas! Vamos jogar um quiz!:
                
                Qual é a classe Java utilizada para equações matemáticas?
                
                1) Math
                2) Pow
                3) Divide
                4) Core
                
                
                """);
            System.out.println("Insira a sua resposta:");
            int new_alt = scanner.nextInt();
            if (new_alt == 1){
                System.out.println("ocê acertou, pode retirar seu bônus na Shostners and Shostners");
            }
            else{
                System.out.println("Você não acertou, mas tente novamente numa próxima");
            }
        }
        else{
            System.out.println("Você escolheu a segunda questão!");
            System.out.println("""
                Boas vindas! Vamos jogar um quiz!:
                
                Qual é a classe Java utilizada para exponenciação matemáticas?
                
                1) Math
                2) Pow
                3) Divide
                4) Core
                
                
                """);
            System.out.println("Insira a sua resposta:");
            int new_alt = scanner.nextInt();
            if (new_alt == 2){
                System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners");
            }
            else{
                System.out.println("Você não acertou, mas tente novamente numa próxima");
            }
        }








    }

}
