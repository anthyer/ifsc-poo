package ads.poo;

public class Personagem {
    private int forca, destreza, constituicao, inteligencia, sabedoria, carisma, vida, classeDeArmadura, nivel;
    private String raca, classe;

    public void definirAtributos(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel) {
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
        this.nivel = nivel;
        this.vida = 10 + (constituicao * this.nivel);
        this.classeDeArmadura = 10 + (destreza * this.nivel);
    }

    public void definirRaca(String raca) {
        this.raca = raca;
    }

    public void definirClasse(String classe) {
        this.classe = classe;
    }

    public int obterVida() {
        return this.vida;
    }

    public int obterCA() {
        return this.classeDeArmadura;
    }

    public String obterRaca() {
        return this.raca;
    }

    public String obterClasse() {
        return this.classe;
    }

}
