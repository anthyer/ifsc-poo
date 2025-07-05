package ads.poo.animais;

public class Lobo extends Animal implements Terrestre, Mamifero {
    public Lobo(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return amamentar() + " e " + correr() + " e " + uivar();
    }

    @Override
    public String amamentar() {
        return nome + " amamentou";
    }

    @Override
    public String correr() {
        return nome + " correu";
    }

    public String uivar(){
        return nome + " uivou";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(nome);
        sb.append(" é um lobo.");
        return sb.toString();
    }
}
