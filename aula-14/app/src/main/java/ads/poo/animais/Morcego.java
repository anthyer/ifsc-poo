package ads.poo.animais;

public class Morcego extends Animal implements Voador, Mamifero, Ecolocalizadores {
    public Morcego(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return amamentar() + " e " + voar() + " e " + sonar();
    }

    @Override
    public String amamentar() {
        return nome + " amamentou";
    }

    @Override
    public String voar() {
        return nome + " voou";
    }

    @Override
    public String sonar() {
        return nome + " se localizou";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(nome);
        sb.append(" é um morcego.");
        return sb.toString();
    }
}
