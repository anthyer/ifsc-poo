package ads.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    Scanner teclado = new Scanner(System.in);
    int numero, posicao;


    public static void main(String[] args) {
        App app = new App();
        Caixa<String> c = new Caixa<>();
        Caixa<Integer> c2 = new Caixa<>();

        String s = "Ola Mundo";
        c.set(s);
        String outra = c.getDado();
        System.out.println(outra);

        int[] vetor = new int[10];

        do {
        } while (!app.verificarNumero());

        do {
        } while (!app.verificarIndex());
        vetor[app.posicao] = app.numero;

        app.teclado.close();
    }

    public boolean verificarNumero(){
        try{
            System.out.println("Entre com um número: ");
            int n = teclado.nextInt();
            numero = n;
            return true;
        } catch (InputMismatchException e){
            System.err.println("Só é permitido número inteiros");
            teclado.nextLine();
            return false;
        } catch (Exception e){
            System.err.println("Ocorreu o erro: " + e.toString());
            teclado.nextLine();
            return false;
        }
    }

    public boolean verificarIndex(){
        try{
            System.out.println("Em qual posição ficará?: ");
            int p = teclado.nextInt();
            posicao = p;
            return true;
        } catch (InputMismatchException e){
            System.err.println("Só é permitido número inteiros");
            teclado.nextLine();
            return false;
        } catch (IndexOutOfBoundsException e){
            System.err.println("Index precisa ser até 9");
            teclado.nextLine();
            return false;
        } catch (Exception e){
            System.err.println("Ocorreu o erro: " + e.toString());
            teclado.nextLine();
            return false;
        }
    }
}
