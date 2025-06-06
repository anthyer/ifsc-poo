package ads.poo;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    private Agenda agenda = new Agenda();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        app.menu();
        app.scanner.close();
    }

    public void menu() {
        boolean sair = false;
        String nome;
        String sobrenome;
        String rotulo;
        String valor;
        int index;

        do{
            System.out.println("Digite o número correspondente a função desejada:\n" +
                    "1 - Adicionar contato\n" +
                    "2 - Encontrar contato\n" +
                    "3 - Remover contato\n" +
                    "4 - Adicionar telefone\n" +
                    "5 - Adicionar e-mail\n" +
                    "6 - Alterar telefone\n" +
                    "7 - Alterar e-mail\n" +
                    "8 - Remover telefone\n" +
                    "9 - Remover e-mail\n" +
                    "0 - Sair");
            String funcao = scanner.nextLine();
            switch (funcao) {
                case "1":
                    System.out.println("Insira um nome: ");
                    nome = scanner.nextLine();
                    System.out.println("Insira um sobrenome: ");
                    sobrenome = scanner.nextLine();
                    System.out.println("Insira data de nascimento(AAAA-MM-DD): ");
                    LocalDate dataNasc =  LocalDate.parse(scanner.nextLine());
                    agenda.addContato(new Contato(nome, sobrenome, dataNasc));
                    break;
                case "2":
                    System.out.println("Insira um nome: ");
                    nome = scanner.nextLine();
                    System.out.println("Insira um sobrenome: ");
                    sobrenome = scanner.nextLine();
                    System.out.println(agenda.findContato(nome, sobrenome));
                    break;
                case "3":
                    System.out.println("Contatos disponíveis:");
                    for (int i = 0; i < agenda.getContatos().size(); i++) {
                        System.out.println(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.println("Insira o índice do contato a ser excluído: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.removeContato(index);
                    break;
                case "4":
                    System.out.println("Contatos disponíveis:");
                    for (int i = 0; i < agenda.getContatos().size(); i++) {
                        System.out.println(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.println("Insira o tipo de número: ");
                    rotulo = scanner.nextLine();
                    System.out.println("Insira o número: ");
                    valor = scanner.nextLine();
                    System.out.println("Insira o índice do contato a receber o número: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.addTelefone(rotulo, valor, index);
                    break;
                case "5":
                    System.out.println("Contatos disponíveis:");
                    for (int i = 0; i < agenda.getContatos().size(); i++) {
                        System.out.println(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.println("Insira o tipo de e-mail: ");
                    rotulo = scanner.nextLine();
                    System.out.println("Insira o e-mail: ");
                    valor = scanner.nextLine();
                    System.out.println("Insira o índice do contato a receber o e-mail: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.addEmail(rotulo, valor, index);
                    break;
                case "6":
                    System.out.println("Contatos disponíveis:");
                    for (int i = 0; i < agenda.getContatos().size(); i++) {
                        System.out.println(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.println("Insira o tipo de número a ser alterado: ");
                    rotulo = scanner.nextLine();
                    System.out.println("Insira o novo número: ");
                    valor = scanner.nextLine();
                    System.out.println("Insira o índice do contato a alterar o número: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.updateTelefone(rotulo, valor, index);
                    break;
                case "7":
                    System.out.println("Contatos disponíveis:");
                    for (int i = 0; i < agenda.getContatos().size(); i++) {
                        System.out.println(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.println("Insira o tipo de e-mail a ser alterado: ");
                    rotulo = scanner.nextLine();
                    System.out.println("Insira o novo e-mail: ");
                    valor = scanner.nextLine();
                    System.out.println("Insira o índice do contato a alterar o e-mail: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.updateEmail(rotulo, valor, index);
                    break;
                case "8":
                    System.out.println("Contatos disponíveis:");
                    for (int i = 0; i < agenda.getContatos().size(); i++) {
                        System.out.println(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.println("Insira o tipo de número a ser excluído: ");
                    rotulo = scanner.nextLine();
                    System.out.println("Insira o índice do contato a ter o número excluído: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.removeTelefone(rotulo, index);
                    break;
                case "9":
                    System.out.println("Contatos disponíveis:");
                    for (int i = 0; i < agenda.getContatos().size(); i++) {
                        System.out.println(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.println("Insira o tipo de e-mail a ser excluído: ");
                    rotulo = scanner.nextLine();
                    System.out.println("Insira o índice do contato a ter o e-mail excluído: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.removeEmail(rotulo, index);
                    break;
                case "0":
                    sair = true;
                    break;
                default:
                    System.out.println("Função inválida\n");
                    break;
            }
        } while(!sair);
    }
}
