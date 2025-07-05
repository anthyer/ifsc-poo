package ads.poo.animais;

public class Baleia extends Animal implements Mamifero, Aquatico, Ecolocalizadores{
    public Baleia(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return nadar() + " e " + sonar() + " e " + amamentar();
    }

    @Override
    public String nadar() {
        return nome + " nadou";
    }

    @Override
    public String sonar() {
        return nome + " se localizou";
    }

    @Override
    public String amamentar() {
        return nome + " amamentou";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(nome);
        sb.append(" é uma baleia.");
        return sb.toString();
    }
}
