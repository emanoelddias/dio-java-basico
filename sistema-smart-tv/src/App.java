public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada : " + smartTv.ligada);
        System.out.println("Canal     : " + smartTv.canal);
        System.out.println("Volume    : " + smartTv.volume);

        smartTv.ligar();

        System.out.println("TV ligada : " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("TV ligada : " + smartTv.ligada);

        smartTv.aumentarVolume();

        System.out.println("TV volume : " + smartTv.volume);

        smartTv.diminuirVolume();

        System.out.println("TV volume : " + smartTv.volume);

        smartTv.aumentarCanal();

        System.out.println("TV canal : " + smartTv.canal);

        smartTv.diminuirCanal();

        System.out.println("TV canal : " + smartTv.canal);

        smartTv.mudarCanal(5);

        System.out.println("TV canal " + smartTv.canal);
    }
    
}
