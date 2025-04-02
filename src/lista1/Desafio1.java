package lista1;

public class Desafio1 {

    public static void main(String[] args) {

        System.out.println(3.0/4.0);


        // Realizando a fórmula matemática


        double formula_valor_de_cima = 3 * Math.pow(-3.0/4.0,-2) + 6 * (Math.pow(3,-1)/4) - 4;

        double formula_valor_de_baixo = 7 * Math.pow(-3.0/4.0,-1) + 2;

        double formula_regular = formula_valor_de_cima/formula_valor_de_baixo;

        double formula_valor_total = Math.pow(formula_regular,-1) + 4;

        System.out.println(formula_valor_total);

    }

}
