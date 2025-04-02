package lista4;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//      Quantidade que será aumentada para validar os 50%
        int quantidade_saldo_positivo = 0;
//      Quantidade total para verificar as regras de 50% dos saldos
        int quantidade_total = 0;
        while (true){
            System.out.println("Informe um saldo!");
//          Recebendo um número positivo ou negativo
            float saldo = scanner.nextFloat();
            quantidade_total++;
//          Se maior que 0, saldo será positivo
            if (saldo >= 0){
                quantidade_saldo_positivo ++;
            }
//          Verificar a continuidado do código
            String opcao_usuario;
            System.out.println("Deseja inserir outro saldo? s/n");
            opcao_usuario = scanner.next();
//          Parar o loop infinito
            if (!opcao_usuario.equals("s")){
                break;
            }
        }
//      Verificar quantidade total de inputs
        System.out.println("O total de pessoas que informaram seu saldo foi: "+quantidade_total+" pessoas.");

//      Output do desafio
        if (quantidade_saldo_positivo > (quantidade_total/2)){
            System.out.println("Nenhum risco!");
        }
        else {
            System.out.println("“Risco ao banco!");
        }
    }
}
