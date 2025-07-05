package ads.poo.animais;

public class Avestruz extends Animal implements Terrestre, Oviparo {
    public Avestruz(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return botarOvo() + " e " + correr();
    }

    @Override
    public String botarOvo() {
        return nome + " botou um ovo";
    }

    @Override
    public String correr() {
        return nome + " correu";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(nome);
        sb.append(" é um avestruz.");
        return sb.toString();
    }
}
