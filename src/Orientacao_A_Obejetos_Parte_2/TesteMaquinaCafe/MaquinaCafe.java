package Orientacao_A_Obejetos_Parte_2.TesteMaquinaCafe;

public class MaquinaCafe {

    public static void main(String[] args) {

        MaquinaDeCafe maquina = new MaquinaDeCafe();

        maquina.azucarDisponivel = 900;
        maquina.fazercafe(10);
        maquina.fazercafe(15);
        maquina.fazercafe();

    }

}
