package ads.poo.jogo;

public class Personagem {
    protected double vida;
    protected double ataque;
    protected double velocidade;

    public Personagem(double vida, double ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public double getVida() {
        return vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public String mover(String direcao){
        return "Personagem se moveu na direção " + direcao + " com velocidade " + this.velocidade;
    }

    public String atacar(Personagem alvo){
        return "Personagem atacou causando " + this.ataque + " de dano";
    }
}
