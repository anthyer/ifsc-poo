package ads.poo;

public class Dimensao {
    private double x, y, z;

    public Dimensao(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Largura: ").append(x).append("\n");
        sb.append("Altura: ").append(y).append("\n");
        sb.append("Profundidade: ").append(z);
        return sb.toString();
    }
}
