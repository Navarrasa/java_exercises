package lista3;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        float valor_viagem = 3000;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Onde você deseja passar as férias?\n1. Maceió\n2. Porto de Galinhas");
        int destino = scanner.nextInt();


        System.out.println("Deseja o valor de almoço e janta incluso?\n1.Sim\n2.Não");
        int comida = scanner.nextInt();


        if (destino == 1 && comida == 1){
            valor_viagem = valor_viagem * 2;
            System.out.println("Perfeito! A viagem custará R$" + valor_viagem);
        } else if (destino == 1 && comida == 2) {
            valor_viagem += (valor_viagem*0.85);
            System.out.println("Perfeito! A viagem custará R$" + valor_viagem);
        }
        if (destino == 2 && comida == 1){
            valor_viagem += (valor_viagem*0.60);
            System.out.println("Perfeito! A viagem custará R$" + valor_viagem);
        } else if (destino == 2 && comida == 2) {
            valor_viagem += (valor_viagem*0.45);
            System.out.println("Perfeito! A viagem custará R$" + valor_viagem);
        }

    }

}
