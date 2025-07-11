package ads.poo;

public class Carta {
    private Naipes naipes;
    private Valor valor;

    public Carta(Naipes naipes, Valor valor) {
        this.naipes = naipes;
        this.valor = valor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(valor).append(naipes);
        return sb.toString();
    }
}
