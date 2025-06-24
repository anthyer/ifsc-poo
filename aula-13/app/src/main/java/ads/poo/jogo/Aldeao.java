package ads.poo.jogo;

public class Aldeao extends Personagem {
    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String mover(String direcao){
        return "Personagem se moveu na direção " + direcao + " com velocidade " + this.velocidade;
    }

    @Override
    public String atacar(Personagem alvo){
        return "Personagem atacou causando " + this.ataque + " de dano";
    }
}
