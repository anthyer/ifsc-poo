package ads.poo;

public class SemFio extends Telefone {
    private double frequencia, distancia;
    private int canais;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dim, double frequencia, double distancia, int canais) {
        super(codigo, numSerie, modelo, peso, dim);
        this.frequencia = frequencia;
        this.distancia = distancia;
        this.canais = canais;
    }

    @Override
    public String imprimirDados() {
        return super.imprimirDados() + "\n" + "Freq: " + this.frequencia;
    }
}
