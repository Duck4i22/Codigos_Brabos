package Orientacao_A_Obejetos_Parte_2.modificadores_static_e_final_5_10;

public class TesteContador {

    public static void main(String[] args) {
        Contador c = new Contador();
        c.incrementar();
        System.out.println(Contador.COUNT);
        Contador.COUNT++;
        Contador.imprimirContador();
    }
}
