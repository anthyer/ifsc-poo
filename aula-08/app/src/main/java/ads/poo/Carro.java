package ads.poo;

public class Carro {
    private String modelo;
    private double velocidadeAtual;
    private static final double VELOCIDADE_MAXIMA = 200; // Final = Constante
    private static final String MODELO_PADRAO = "Fusca";
    private static int contador;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
        contador++;
    }

    public Carro() {
        this(MODELO_PADRAO);
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static int getContador() {
        return contador;
    }

    public void acelerar(int incremento) {
        if (velocidadeAtual <= VELOCIDADE_MAXIMA) {
            velocidadeAtual += incremento;
        } else {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
    }
}
