package ads.poo;
import java.util.*;

public class Batedeira {
    private int velocidades;
    private List<String> acessorios = new ArrayList<String>();
    private double preco;

    public void definirVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public void definirPreco(double preco) {
        this.preco = preco;
    }

    public void incluirAcessorio(String acessorio) {
        this.acessorios.add(acessorio);
    }

    public int obterVelocidades() {
        return this.velocidades;
    }

    public List<String> obterAcessorios() {
        return this.acessorios;
    }

    public double obterPreco() {
        return this.preco;
    }
}
