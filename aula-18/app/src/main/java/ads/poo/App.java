package ads.poo;

public class App {
    public static void main(String[] args) {
        Pilha<Integer> pilinha = new Pilha<>(10);
        Pilha<String> pilhona = new Pilha<>(5);

        try {
            pilinha.empilhar(10);
            pilinha.empilhar(1);
            System.out.println(pilinha.getTopo());
            pilinha.desempilhar();
            System.out.println(pilinha.getTopo());
        } catch (PilhaVaziaException p){
            System.err.println("Erro: " + p.getMessage());
        } catch (PilhaCheiaException p){
            System.err.println("Erro: " + p.getMessage());
        }

        try {
            pilhona.empilhar("1");
            pilhona.empilhar("2");
            pilhona.empilhar("3");
            pilhona.empilhar("4");
            pilhona.empilhar("5");
            pilhona.empilhar("6");
        } catch (PilhaVaziaException p){
            System.err.println("Erro: " + p.getMessage());
        } catch (PilhaCheiaException p){
            System.err.println("Erro: " + p.getMessage());
        }

    }
}
