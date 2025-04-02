package desafios;

public class Q15 {

    public static void main(String[] args) {

//        Escreva um programa Java que use um loop while para imprimir uma
//        contagem regressiva de 10 a 1, e quando chegar a 1, imprima "Fogo!"

//        Iniciando a contagem!
//        Decrementando 1 de valor da variável i, a cada repetição
        for (int i = 10; i >=1; i--){

            System.out.println("Contagem regressiva! "+i);
//            Quando chegar a um, printa Fogo!
            if (i == 1){
                System.out.println("Fogo!!!");
            }
        }
    }
}
