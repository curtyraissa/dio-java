public class Usuario{
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv ();
        smartTv.abaixarVolume ();
        smartTv.abaixarVolume ();
        smartTv.abaixarVolume ();
        smartTv.aumentarVolume ();
        System.out.println(" Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Novo Status. Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status. Tv ligada? " + smartTv.ligada);
        System.out.println("Novo Status. volume atual: " + smartTv.volume);
    }
}
