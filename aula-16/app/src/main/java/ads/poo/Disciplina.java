package ads.poo;

public class Disciplina {
    private String sigla;
    private DiasDaSemana[] diasSemana;

    public Disciplina(String sigla, DiasDaSemana[] diasSemana) {
        this.sigla = sigla;
        this.diasSemana = diasSemana;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sigla: ");
        sb.append(sigla).append("\n").append("Dias da semana: ");
        for (int i = 0; i < diasSemana.length; i++) {
            sb.append(diasSemana[i]);
            if (diasSemana.length > 1 && i != diasSemana.length-1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
