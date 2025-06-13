package ads.poo;

public class Celular extends SemFio{
    private String sO;

    public Celular(int codigo, String numSerie, String modelo, double peso, Dimensao dim, double frequencia, double distancia, int canais, String sO) {
        super(codigo, numSerie, modelo, peso, dim, frequencia, distancia, canais);
        this.sO = sO;
    }
}
