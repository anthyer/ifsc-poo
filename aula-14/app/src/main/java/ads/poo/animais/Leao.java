package ads.poo.animais;

public class Leao extends Animal implements Terrestre, Mamifero{
    public Leao(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return amamentar() + " e " + correr() + " e " + rugir();
    }

    @Override
    public String amamentar() {
        return nome + " amamentou";
    }

    @Override
    public String correr() {
        return nome + " correu";
    }

    public String rugir(){
        return nome + " rugiu";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(nome);
        sb.append(" é um leão.");
        return sb.toString();
    }
}
