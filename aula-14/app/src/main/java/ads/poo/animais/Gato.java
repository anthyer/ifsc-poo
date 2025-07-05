package ads.poo.animais;

public class Gato extends  Animal implements Terrestre, Mamifero{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return amamentar() + " e " + correr() + " e " + miar();
    }

    @Override
    public String amamentar() {
        return nome + " amamentou";
    }

    @Override
    public String correr() {
        return nome + " correu";
    }

    public String miar(){
        return nome + " miou";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(nome);
        sb.append(" é um gato.");
        return sb.toString();
    }
}
