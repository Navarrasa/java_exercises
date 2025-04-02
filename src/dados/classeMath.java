package dados;

public class classeMath {

    public static void main(String[] args) {

     int a = 10;
     int b = 5;

        System.out.println("Operações Aritméticas");


        // Soma
        System.out.println("Soma: " + (a+b));

        // Subtração
        System.out.println("Subtração: " + (a-b));

        // Multiplicação
        System.out.println("Multiplicação " + (a*b));

        // Divisão
        System.out.println("Divisão " + (a/b));

        // Resto
        System.out.println("Soma: " + (a%b));

        // Funções da classe Math
        System.out.println("Funções da classe Math");

        // Math.abs()
        System.out.println("Valor absoluto de -10: " + Math.abs(-10));

        // Math.pow()
        System.out.println("2 elevado a 3: " + Math.pow(2,3));

        // Math.sqrt()
        System.out.println("Raiz quadrada de 16: " + Math.sqrt(16));

        // Math.max()
        System.out.println("Máximo entre 10 e 5: " + Math.max(5,10));

        // Math.min()
        System.out.println("Menor valor entre 10 e 5: " + Math.min(5,10));

        // Math.random
        System.out.println("Número aleatório entre 0 e 1: " + Math.random());

        // Math.round
        System.out.println("Arredondamento de 3.6: " + Math.round(3.6));

        //Math.sin()
        System.out.println("Seno de 30 graus (em radianos): " + Math.sin(Math.toRadians(30)));

        //Math.cos()
        System.out.println("Cosseno de 30 graus (em radianos): " + Math.cos(Math.toRadians(30)));

        //Math.tan()
        System.out.println("Tangente de 45 graus (em radianos): " + Math.tan(Math.toRadians(45)));

    }
}
