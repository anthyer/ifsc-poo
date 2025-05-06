package ads.poo;
import java.util.*;

public class Batedeira {
    private int velocidade;
    private List<String> acessorios = new ArrayList<String>();
    private double preco;

    public void definirVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void definirPreco(double preco) {
        this.preco = preco;
    }

    public void incluirAcessorio(String acessorio) {
        this.acessorios.add(acessorio);
    }

    public int obterVelocidade() {
        return this.velocidade;
    }

    public List<String> obterAcessorios() {
        return this.acessorios;
    }

    public double obterPreco() {
        return this.preco;
    }
}
