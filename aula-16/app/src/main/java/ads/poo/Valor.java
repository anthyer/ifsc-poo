package ads.poo;

public enum Valor {
    AS("Ás", 1),
    DOIS("Dois", 2),
    TRES("Três", 3),
    QUATRO("Quatro", 4),
    CINCO("Cinco", 5),
    SEIS("Seis", 6),
    SETE("Sete", 7),
    OITO("Oito", 8),
    NOVE("Nove", 9),
    DEZ("Dez", 10),
    VALETE("Valete", 11),
    DAMA("Dama", 12),
    REI("Rei", 13),;

    public String nome;
    public int valor;

    Valor(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
