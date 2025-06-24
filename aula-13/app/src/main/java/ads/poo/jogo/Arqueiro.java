package ads.poo.jogo;

public class Arqueiro extends Personagem{
    public Arqueiro() {
        super(35, 2, 1);
    }

    @Override
    public String mover(String direcao){
        return "Arqueiro se moveu na direção " + direcao + " com velocidade " + this.velocidade;
    }

    @Override
    public String atacar(Personagem alvo){
        return "Arqueiro atacou causando " + this.ataque + " de dano";
    }
}
