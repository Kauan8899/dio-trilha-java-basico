package SISTEMA_SMART_TV;

public class Usuario {

    public static void main (String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual:"+ smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual:"+ smartTv.canal);

        System.out.println("volume atual :" + smartTv.volume);

        System.out.println("Tv ligada ?" + smartTv.ligada);
        System.out.println("Canal atual :" + smartTv.canal);
        System.out.println("volume atual :" + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> Tv ligada ?" + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> Tv ligada ?" + smartTv.ligada);
    }

}