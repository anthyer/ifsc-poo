package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;
import java.util.Random;

public class App implements DrawListener {
    private Draw draw;

    public App() {
        this.draw = new Draw();
        this.draw.addListener(this);
        this.draw.show();
    }

    @Override
    public void mousePressed(double x, double y) {
        Random r = new Random();
        // Criar bandeira
        Bandeira japonito = new Bandeira(r.nextDouble(.1, .5), x, y);
        // Desenhar bandeira
        japonito.desenhar(draw);
    }

    @Override
    public void keyTyped(char c) {
        if(c=='l'){
            this.draw.clear();
        }
    }

    public static void main(String[] args) {
        App app = new App();
    }
}
