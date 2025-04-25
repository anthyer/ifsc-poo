package ads.poo;

public class App {
    public static void main(String[] args) {
        Contador cont = new Contador();

        cont.atribuirValor(10);
        System.out.println(cont.obterValor());
        cont.incrementarValor();
        System.out.println(cont.obterValor());

        Personagem erik = new Personagem();

        erik.definirAtributos(10, 10, 10, 10, 10, 10, 2);
        erik.definirRaca("Goblin");
        erik.definirClasse("Ladino");
        System.out.println(erik.obterRaca());
        System.out.println(erik.obterClasse());
        System.out.println(erik.obterVida());
        System.out.println(erik.obterCA());

        Batedeira bat = new Batedeira();

        bat.incluirAcessorio("Pá de pão");
        bat.incluirAcessorio("Pá de bolo");

        System.out.println(bat.obterAcessorios());
    }
}
