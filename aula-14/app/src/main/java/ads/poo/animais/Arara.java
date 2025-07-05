package ads.poo.animais;

public class Arara extends Animal implements Voador, Oviparo {
    public Arara(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return botarOvo() + " e " + voar() + " e " + falar();
    }

    @Override
    public String botarOvo() {
        return nome + " botou ovo";
    }

    @Override
    public String voar() {
        return nome + " voou";
    }

    public String falar() {
        return nome + " falou";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(nome);
        sb.append(" é uma arara.");
        return sb.toString();
    }
}
