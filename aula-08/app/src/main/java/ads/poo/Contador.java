package ads.poo;

public class Contador {
    private int valorAtual;

    public void atribuirValor(int i) {
        this.valorAtual = i;
    }

    public void incrementarValor() {
        valorAtual++;
    }

    public int obterValor() {
        return valorAtual;
    }
}
