package ads.poo.formas;

public class Forma {
    protected Vector2D origem;
    protected Vector2D limite;
    protected double perimetro;
    protected String corDaLinha;

    public Forma(Vector2D origem, Vector2D limite, String corDaLinha) {
        this.origem = origem;
        this.limite = limite;
        this.perimetro = calcularPerimetro();
        this.corDaLinha = corDaLinha;
    }

    public String desenhar(){
        return "Ponto inicial: " + this.origem + "\n" + "Ponto final: " + this.limite;
    }

    public double calcularPerimetro(){
        return Math.sqrt(Math.pow((this.origem.getX() - this.limite.getX()), 2) + Math.pow((this.origem.getY() - this.limite.getY()), 2));
    }
}
