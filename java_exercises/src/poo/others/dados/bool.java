package poo.others.dados;

public class bool {
    // Trabalhando com if e else
    public static void main(String[] args){

        double media = 6;
        int faltas = 20;
        boolean postura = true;
        String situacao;

        // && (AND)
        // || (OR)
        // ! (NOT)

        if (media >= 5.0 && faltas < 25 && postura == true){
            situacao = "Aprovado";
        } else if (media >= 5.0 && faltas < 25 && postura) {
            situacao = "Reprovada";
        } else if (media < 5.0 && faltas < 25 && postura) {
            situacao = "Sem Férias";
        } else if (media < 5.0 && faltas < 25 && !postura) {
            situacao = "Chamar pra conversar";
        }else{
            situacao = "Reprovado";
        }
        System.out.println(situacao);
    }
}
