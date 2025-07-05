package ads.poo;
import edu.princeton.cs.algs4.Draw;

public class Bandeira {
    private double escala;
    private double x;
    private double y;

    public Bandeira(double escala, double x, double y) {
        this.escala = escala;
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d) {
        d.setPenColor(255, 255, 255);
        d.filledRectangle(x, y, (.4 * escala), (.25 * escala));
        d.setPenColor(0, 0, 0);
        d.rectangle(x, y, (.4 * escala), (.25 * escala));
        d.setPenColor(255, 0, 0);
        d.filledCircle(x, y,(.15 * escala));
    }
}
