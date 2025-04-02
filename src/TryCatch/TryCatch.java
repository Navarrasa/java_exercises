package TryCatch;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("Digite um numerador");
            int numerador = scanner.nextInt();

            System.out.println("Digite o denominador");
            int denominador = scanner.nextInt();

            int resultado = dividir(numerador, denominador);
            System.out.println("Resultado: "+ resultado);

        }catch (ArithmeticException e){
            System.out.println("Erro: Não é possível dividir por zero! ");
        }catch (Exception e){
            System.out.println("Erro: Entrada Inválida. Certifique-se de inserir números inteiros! ");
        }finally {
            scanner.close();
            System.out.println("Programa Finalizado!");
        }

    }
    public static int dividir(int a, int b){
        return a/b;
    }
}
