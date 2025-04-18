package ads.poo;

public class App {
    public static void main(String[] args) {
        Caneta bic = new Caneta("Preta", 100, false);
        Caneta compactor = new Caneta("Azul", 80, false);

        bic.definirNivelTinta(101);
        System.out.println(bic.isNivelTinta());
        bic.trocarEstado();
        System.out.println(bic.desenhar(5));
        System.out.println(bic.desenhar(6));
        System.out.println(bic.desenhar(2));
        System.out.println(bic.isNivelTinta());
    }
}