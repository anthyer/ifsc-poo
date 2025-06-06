package ads.poo;

import java.time.LocalDate;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ColecaoTelefone telefones;
    private ColecaoEmail emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = new ColecaoTelefone();
        this.emails = new ColecaoEmail();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public boolean addTelefone (String rotulo, String valor) {
        return telefones.add(rotulo,valor);
    }

    public boolean addEmail (String rotulo, String valor) {
        return emails.add(rotulo,valor);
    }

    public boolean removeTelefone(String rotulo) {
        return telefones.remove(rotulo);
    }

    public boolean removeEmail(String rotulo) {
        return emails.remove(rotulo);
    }

    public boolean updateTelefone(String rotulo, String valor) {
        return telefones.update(rotulo,valor);
    }

    public boolean updateEmail(String rotulo, String valor) {
        return emails.update(rotulo,valor);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Nome: ").append(nome).append('\n');
        sb.append("Sobrenome: ").append(sobrenome).append('\n');
        sb.append("Data de Nascimento: ").append(dataNasc).append('\n');
        sb.append("Telefones: \n").append(telefones).append('\n');
        sb.append("E-mails: \n").append(emails).append('\n');
        return sb.toString();
    }
}
