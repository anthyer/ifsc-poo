package ads.poo;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        // Contador
        Contador cont = new Contador();

        System.out.println("=-=-=-=-=-= CONTADOR =-=-=-=-=-=");
        cont.atribuirValor(10);
        System.out.println(cont.obterValor());
        cont.incrementarValor();
        System.out.println(cont.obterValor());
        System.out.println();

        // Personagem
        Personagem erik = new Personagem();

        System.out.println("=-=-=-=-=-= PERSONAGEM =-=-=-=-=-=");
        erik.definirAtributos(10, 10, 10, 10, 10, 10, 2);
        erik.definirRaca("Goblin");
        erik.definirClasse("Ladino");
        System.out.println(erik.obterRaca());
        System.out.println(erik.obterClasse());
        System.out.println(erik.obterVida());
        System.out.println(erik.obterCA());
        System.out.println();

        // Batedeira
        Batedeira bat = new Batedeira();

        System.out.println("=-=-=-=-=-= BATEDEIRA =-=-=-=-=-=");
        bat.incluirAcessorio("Pá de pão");
        bat.incluirAcessorio("Pá de bolo");
        bat.definirVelocidade(5);
        System.out.println(bat.obterAcessorios());
        System.out.println(bat.obterVelocidade());
        System.out.println();

        // Disciplina
        Disciplina poo = new Disciplina("Programação Orientada à Objetos", "POO", "786202", 40, 300);
        Disciplina red = new Disciplina("Redes", "RED", "123456", 40, 300);

        System.out.println("=-=-=-=-=-= DISCIPLINA =-=-=-=-=-=");
        System.out.println(poo);
        System.out.println(red);
        System.out.println();

        // Caneta
        System.out.println("=-=-=-=-=-= CANETA =-=-=-=-=-=");
        Caneta caneta1 = new Caneta();
        Caneta caneta3 = new Caneta("Vermelha");
        Caneta caneta2 = new Caneta("Azul", 80);

        System.out.println(caneta1.desenhar(5));
        System.out.println(caneta2.desenhar(3, "="));
        System.out.println();

        // Carro
        System.out.println("=-=-=-=-=-= CARRO =-=-=-=-=-=");
        Carro carro1 = new Carro();
        System.out.println(carro1.getModelo());
        System.out.println(Carro.getContador()); // Pode ser acessado direto da classe por ser estático
        Carro carro2 = new Carro("Buggy");
        System.out.println(carro2.getModelo());
        System.out.println(Carro.getContador());
        System.out.println();
    }
}
