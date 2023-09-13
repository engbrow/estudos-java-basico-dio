public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Canal atual: " +smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " +smartTv.canal);

        smartTv.mudarCanalAcima();
        smartTv.mudarCanalAcima();
        smartTv.mudarCanalAcima();
        smartTv.mudarCanalAbaixo();

        System.out.println("Canal atual: " +smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " +smartTv.volume);

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV LIgada ? " +smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV LIgada ? " +smartTv.ligada);
    }
}
