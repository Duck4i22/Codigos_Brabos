package Orientacao_A_Obejetos_Parte_2.modificador_de_acesso_default_5_9;

public class TreinadorCachorro {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");
        DonoCachorro donoCachorro = new DonoCachorro();
        donoCachorro.ensinarCachorroSentar(cachorro);
    }
}
