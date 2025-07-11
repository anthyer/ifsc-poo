package ads.poo;

public enum Planetas {
    MERCURIO(1, "Mercúrio"),
    VENUS(2, "Vênus"),
    TERRA(3,  "Terra"),
    MARTE(4,  "Marte"),
    JUPITER(5,   "Jupiter"),
    SATURNO(6, "Saturno"),
    URANO(7, "Urano"),
    NETUNO(8, "Netuno");

    private int pos;
    private String nome;

    Planetas(int pos, String nome) {
        this.pos = pos;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome + " está na posição " + this.pos;
    }
}
