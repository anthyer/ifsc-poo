package ads.poo;

public class Telefone {
    private int codigo;
    private String numSerie, modelo;
    private double peso;
    private Dimensao dim;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dim) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dim = dim;
    }

    public String imprimirDados() {
        return "Código: " + this.codigo + "\n" + dim.toString();
    }
}
