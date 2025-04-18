package ads.poo;

public class Caneta {
    // Atributos
    private String cor;
    private double nivelTinta;
    private boolean aberta;

    // Construtor
    public Caneta(String c, double n, boolean a) {
        this.cor = c;
        this.nivelTinta = n;
        this.aberta = a;
    }

    // Getters e Setters
    public void definirCor(String c) {
        this.cor = c;
    }

    public void definirNivelTinta(double n) {
        this.nivelTinta = (n < 0 || n > 100) ? 100 : n;
    }

    public void definirAberto(boolean a) {
        this.aberta = a;
    }

    public String isCor() {
        return cor;
    }

    public double isNivelTinta() {
        return nivelTinta;
    }

    public boolean isAberta() {
        return aberta;
    }

    // Métodos
    public void trocarEstado() {
        aberta = !aberta;
    }

    public String desenhar(int n) {
        if (aberta && n > 0) {
            StringBuilder aux = new StringBuilder("");
            for (int i = 0; i < n; i++) {
                if (nivelTinta > 9) {
                    aux.append("_ ");
                    nivelTinta = nivelTinta - 10;
                } else {
                    return aux.toString();
                }
            }
            return aux.toString();
        } else {
            return "";
        }
    }
}
