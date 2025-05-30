package ads.poo;

public class Motor {
    private double consumo;
    private String tipo;
    private boolean estado;

    public Motor(double consumo, String tipo) {
        this.consumo = consumo;
        this.tipo = tipo;
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

    public boolean ligaDesliga() {
        estado = !estado;
        return estado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Motor{");
        sb.append("consumo=").append(consumo);
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
}
