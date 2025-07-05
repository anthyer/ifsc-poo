package ads.poo.animais;

public class Ornitorrinco extends Animal implements Mamifero, Oviparo, Terrestre {
    public Ornitorrinco(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return amamentar() + " + " + botarOvo() + " e " + correr();
    }

    @Override
    public String amamentar() {
        return nome + " amamentou";
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
        sb.append(" é um ornitorrinco.");
        return sb.toString();
    }
}
