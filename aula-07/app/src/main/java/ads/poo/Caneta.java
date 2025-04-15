package ads.poo;

public class Caneta {
    // Atributos
    private String cor;
    private double nivelTinta;
    private boolean aberta;

    // Métodos
    public void definirCor(String c) {
        cor = c;
    }

    public void definirNivelTinta(double n) {
        nivelTinta = n;
    }

    public void trocarEstado() {
        aberta = !aberta;
    }

    public boolean isAberta() {
        return aberta;
    }

    public String isCor() {
        return cor;
    }
}
