package ads.poo.jogo;

public class Cavaleiro extends Personagem{
    public Cavaleiro() {
        super(50, 3, 2);
    }

    @Override
    public String mover(String direcao){
        return "Cavaleiro se moveu na direção " + direcao + " com velocidade " + this.velocidade;
    }

    @Override
    public String atacar(Personagem alvo){
        return "Cavaleiro atacou causando " + this.ataque + " de dano";
    }
}
