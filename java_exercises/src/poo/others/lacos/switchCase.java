package lacos;

public class switchCase {

    public static void main(String[] args) {

        int day = 3;

        switch (day){

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido!");
                break;

        }


    }

}
