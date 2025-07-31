package lista4;

import java.util.Scanner;

public class Atividade3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar as respostas
        int otimo = 0, bom = 0, ruim = 0;
        int totalRespostas = 0;
        int somaNotas = 0;

        // Laço principal para coletar respostas
        while (true) {
            // Solicitar opinião do fã
            System.out.println("Qual a sua opinião sobre o filme?");
            System.out.println("1 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("3 - Ruim");

            // Ler a resposta do fã
            int resposta;
            while (true) {
                System.out.print("Digite 1, 2 ou 3: ");
                resposta = scanner.nextInt();

                // Verificar se a resposta é válida
                if (resposta == 1 || resposta == 2 || resposta == 3) {
                    break;
                } else {
                    System.out.println("Resposta inválida! Digite apenas 1, 2 ou 3.");
                }
            }

            // Atualizar contadores de respostas e soma das notas
            if (resposta == 1) {
                otimo++;
                somaNotas += 1;
            } else if (resposta == 2) {
                bom++;
                somaNotas += 2;
            } else {
                ruim++;
            }
            totalRespostas++;

            // Perguntar se deseja continuar
            System.out.print("Deseja continuar? (S/N): ");
            char continuar = scanner.next().charAt(0);

            if (continuar == 'N' || continuar == 'n') {
                break;
            }
        }

        // Exibir resultados
        System.out.println("\nResultados:");

        // Quantidade de respostas 'ótimo' e percentual
        double percentualOtimo = (otimo / (double) totalRespostas) * 100;
        System.out.println("Ótimo: " + otimo + " respostas (" + String.format("%.2f", percentualOtimo) + "%)");

        // Quantidade de respostas 'bom' e percentual
        double percentualBom = (bom / (double) totalRespostas) * 100;
        System.out.println("Bom: " + bom + " respostas (" + String.format("%.2f", percentualBom) + "%)");

        // Quantidade de respostas 'ruim' e percentual
        double percentualRuim = (ruim / (double) totalRespostas) * 100;
        System.out.println("Ruim: " + ruim + " respostas (" + String.format("%.2f", percentualRuim) + "%)");

        // Total de respostas
        System.out.println("Total de respostas: " + totalRespostas);

        // Média das notas
        double mediaNotas = (totalRespostas > 0) ? somaNotas / (double) totalRespostas : 0;
        System.out.println("Média das notas: " + String.format("%.2f", mediaNotas));

        scanner.close();
    }
}
