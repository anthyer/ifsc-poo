package ads.poo.animais;

public class Cachorro extends Animal implements Terrestre, Mamifero {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return amamentar() + " e " + correr() + " e " + latir();
    }

    @Override
    public String amamentar() {
        return nome + " amamentou";
    }

    @Override
    public String correr() {
        return nome + " correu";
    }

    public String latir(){
        return nome + " latiu";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(nome);
        sb.append(" é um cachorro.");
        return sb.toString();
    }
}
