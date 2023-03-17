public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println( "TV Ligada ? " + smartTv.ligada);  
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println( "Volume Atual? " + smartTv.volume);  

        smartTv.mudarCanal(22);
        System.out.println( "Canal atual " + smartTv.canal);



        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

       
    }
    
}
