package Logica.Estruturas_De_Repeticao;

public class IteracaoWhile {

    public static void main(String[] args) {
        /*
        for(int i=0 ; i<10 ; i++){
            System.out.print("eu amo java");
        }
        */

         /*

        int i = 1;


        while (i<10){
            System.out.println("eu amo java");
            i++;
        }
        */

        /*
        int i = 0;

        while (i<10){
            if(i==5){
                System.out.println("vai parar");
                break;
            }
            System.out.println(i+ ": eu amo java");
            i++;
        }

        */

        int i = 0;
        while (i < 10) {
            if (i == 5) {
                System.out.println("Vai continuar...");
                i++;
                continue;
            }
            System.out.println(i + ": Eu amo IntelliJ");
            i++;
        }



    }
}
