package ads.poo.animais;

public class Macaco extends Animal implements Terrestre, Mamifero {
    public Macaco(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return amamentar() + " e " + correr();
    }

    @Override
    public String amamentar() {
        return nome + " amamentou";
    }

    @Override
    public String correr() {
        return nome + " correu";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(nome);
        sb.append(" é um macaco.");
        return sb.toString();
    }
}
