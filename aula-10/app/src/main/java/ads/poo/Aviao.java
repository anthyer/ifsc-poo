package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int maxTripulantes, maxPassageiros;
    private double pesoMaximo, maxCombustivel;
    private ArrayList<Motor> motor = new ArrayList<>();

    public Aviao(int maxTripulantes, int maxPassageiros, double pesoMaximo, double maxCombustivel, int totalMotores, double consumoMotor, String tipoMotor) {
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.pesoMaximo = pesoMaximo;
        this.maxCombustivel = maxCombustivel;
        int aux = (totalMotores < 9 || totalMotores > 0) ? totalMotores : 8;

        for (int i = 0; i < aux; i++) {
            this.motor.add(new Motor(consumoMotor, tipoMotor));
        }
    }

    public boolean ligaDesliga() {
        motor.forEach(Motor::ligaDesliga);
        return motor.getFirst().isEstado();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aviao{");
        sb.append("maxTripulantes=").append(maxTripulantes);
        sb.append(", maxPassageiros=").append(maxPassageiros);
        sb.append(", pesoMaximo=").append(pesoMaximo);
        sb.append(", maxCombustivel=").append(maxCombustivel);
        sb.append(", motor=").append(motor);
        sb.append('}');
        return sb.toString();
    }
}
