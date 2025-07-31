package lista1;

public class Atividade6 {

    public static void main(String[] args) {

        // Fórmula do Delta (Equação de Segundo Grau), muito simples.

        int coeficiente_a = 1;
        int coeficiente_b = 12;
        int coeficiente_c = -13;

        double delta = (Math.pow(coeficiente_b,2)) - 4 * coeficiente_a * coeficiente_c;


        System.out.println("O delta desta equação é: " +delta);
        System.out.println("A raíz quadrada do Delta é: " +Math.sqrt(delta));
        System.out.println("Como a raíz é positiva, existem duas raízes possíveis.");

    }

}
