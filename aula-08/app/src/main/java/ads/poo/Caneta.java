package ads.poo;

public class Caneta {
    private String cor;
    private double nivelTinta;
    private boolean aberta;
    private static final String COR_PADRAO = "Preta";
    private static final double NIVEL_PADRAO = 100;
    private static final boolean ABERTA_PADRAO = false;
    private static final String PONTA_PADRAO = "-";


    public Caneta(String cor, double nivelTinta, boolean aberta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
        this.aberta = aberta;
    }

    public Caneta() {
        this(COR_PADRAO, NIVEL_PADRAO, ABERTA_PADRAO);
    }

    public Caneta(String cor) {
        this();
        this.cor = cor;
    }

    public Caneta(String cor, double nivelTinta) {
        this(cor);
        this.nivelTinta = nivelTinta;
    }

    public String desenhar(int quantidade, String ponta) {
        return ponta.repeat(quantidade);
    }

    public String desenhar(int quantidade) {
        return this.desenhar(quantidade, PONTA_PADRAO);
    }
}
