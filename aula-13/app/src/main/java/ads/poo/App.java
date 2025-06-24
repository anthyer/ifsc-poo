package ads.poo;

import ads.poo.jogo.Aldeao;
import ads.poo.jogo.Arqueiro;
import ads.poo.jogo.Cavaleiro;

public class App {
    public static void main(String[] args) {
        Aldeao erik = new Aldeao();
        Arqueiro bernardo = new Arqueiro();
        Cavaleiro antonio = new Cavaleiro();

        System.out.println(antonio.mover("Norte"));
        System.out.println(antonio.atacar(erik));
        System.out.println(antonio.atacar(bernardo));

        System.out.println(erik.mover("Oeste"));
        System.out.println(erik.atacar(bernardo));

        System.out.println(bernardo.mover("Leste"));
        System.out.println(bernardo.atacar(erik));
    }
}
