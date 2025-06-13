package ads.poo;

public class App {
    public static void main(String[] args) {
        Dimensao dim = new Dimensao(5,5,5);
        Telefone telefone = new Telefone(1, "123", "Disco", 5.5, dim);
        SemFio semFio = new SemFio(2, "321", "Nokia Tijolo", 5.5, new Dimensao(10,10,10), 9.5, 2.5, 3);

        System.out.println(telefone.imprimirDados() + "\n");
        System.out.println(semFio.imprimirDados());
    }
}
