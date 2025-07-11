package ads.poo;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baralho() {
        for (Naipes n : Naipes.values()) {
            for(Valor v : Valor.values()) {
                cartas.add(new Carta(n, v));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(this.cartas);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        for (Carta c : cartas) {
            sb.append(c.toString()).append("\n");
        };
        return sb.toString();
    }
}
