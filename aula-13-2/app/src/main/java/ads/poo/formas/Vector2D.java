package ads.poo.formas;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("X: ").append(x).append(", ");
        sb.append("Y: ").append(y);
        return sb.toString();
    }
}
