package desafios;

public class Q12 {

    public static void main(String[] args) {

//        Elabore um programa Java que utilize um loop for para
//        imprimir os números de 1 a 10, e use a declaração break para sair do loop quando o número 5 for atingido

        System.out.println("Iniciando contagem!");

        for (int i = 1; i <= 10; i++){
//      Quando a contagem chega em 5, ela é forçada a parar.
            if (i == 5){
                System.out.println("O iterável chegou a 5! Parando programa\n");
                break;
            }
            else {
//                Enquanto estamos na contagem, o número atual é mostrado.
                System.out.printf("Número atual: %d\n", i);
            }
        }
        System.out.println("\nSaímos do loop!");
    }
}
