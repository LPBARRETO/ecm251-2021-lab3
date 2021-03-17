package barreto.lucas;

public class Basico02 {
    //Estruturas de decisão
    public static void main(String[] args) {
        int ano = 2021;

        //Estrutura de decisão simples
//        if(ano % 2 == 0){
//            System.out.println("Ano par!");
//        }
//        if(ano % 2 == 1){
//            System.out.println("Ano Impar!");
//        }

        //Estrutura de decisão composta
        if(ano %2 == 0) {
            System.out.println("Ano Par!");
        }else{
                System.out.println("Ano Impar!");

        }

        //Varias Decisões
        switch (ano){
            case 2020:
                System.out.println("Vixi!");
                break;
            case 1996:
                System.out.println("Pokemon Red!");
                break;
            default:
                System.out.println("Quase Boku no hero saindo!");
                break;
        }
    }
}
