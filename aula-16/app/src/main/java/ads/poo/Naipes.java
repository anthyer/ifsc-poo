package ads.poo;

public enum Naipes {
    PAUS("\u2663", 4),
    OUROS("\u2666", 1),
    COPAS("\u2665", 3),
    ESPADAS("\u2660", 2);

    public String nome;
    public int valor;

    Naipes(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
