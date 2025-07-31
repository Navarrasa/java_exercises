package desafios;

import java.util.Scanner;

public class DesafioTryCatch {

    public static void main(String[] args) {
        // Scanner para obtenção do input do usuário e variável para o do while
        Scanner scanner = new Scanner(System.in);
        int selecao = 1;
        do {

            try {
                // Definindo as variáveis
                System.out.println("Digite o primeiro número (pode ser inteiro ou decimal):");
                double numero1 = scanner.nextDouble();
                System.out.println("Agora o segundo número:");
                double numero2 = scanner.nextDouble();
                // Pequeno menu
                System.out.println("Que operação deseja realizar?");
                System.out.println("""
                        1. Soma
                        2. Subtração
                        3. Multiplicação
                        4. Divisão
                        5. Potenciação
                        """);
                int opcao = scanner.nextInt();
                // output do menu
                switch (opcao){
                    case 1:
                        System.out.println("Soma: " + somar(numero1, numero2));
                        break;

                    case 2:
                        System.out.println("Subtração: " + subtrair(numero1, numero2));
                        break;

                    case 3:
                        System.out.println("Multiplicação: " + multiplicar(numero1, numero2));
                        break;

                    case 4:
                        System.out.println("Divisão: " + dividir(numero1, numero2));
                        break;

                    case 5:
                        System.out.println("Potenciação: " + potenciacao(numero1, numero2));
                        break;

                    default:
                        System.out.println("Opção inválida! Selecione entre 1 e 5.");
                }
            // catch para operações contra 0
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir por zero!");
            // Caso o usuário utilize letras em vez de palavras
            } catch (Exception e) {
                System.out.println("Operação inválida! Tente novamente.");
            }

            // evitar o pulo da linha
            scanner.nextLine();

            System.out.println("Deseja realizar um novo cálculo? (s/n)");
            String opcaoContinue = scanner.nextLine();
            if (opcaoContinue.equalsIgnoreCase("n")) {
                selecao++;
            }

        } while (selecao == 1);

        scanner.close(); // Fechando o scanner para evitar vazamentos de recursos
    }

    // funções que irão retornar os devidos dados
    public static double somar(double a, double b){
        return a + b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }
    // caso o divisor seja zero
    public static double dividir(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }

    public static double potenciacao(double a, double b){
        return Math.pow(a, b);
    }
}
