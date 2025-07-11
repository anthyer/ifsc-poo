package ads.poo;

public class App {

    public static final String DOM = "dom";
    public static final String SEG = "seg";
    public static final String TER = "ter";
    public static final String QUA = "qua";
    public static final String QUI = "qui";
    public static final String SEX = "sex";
    public static final String SAB = "sab";

    public static void main(String[] args) {
        Disciplina d = new Disciplina("POO", new DiasDaSemana[]{DiasDaSemana.SEGUNDA, DiasDaSemana.QUINTA});
        Disciplina d2 = new Disciplina("FE", new DiasDaSemana[]{DiasDaSemana.TERCA, DiasDaSemana.QUINTA});

        System.out.println(d);
        System.out.println(d2);

        for(DiasDaSemana a : DiasDaSemana.values()){
            System.out.println(a);
        }

        DiasDaSemana e = DiasDaSemana.QUINTA;

        switch(e){
            case SEGUNDA -> System.out.println("Tem aula");
            case TERCA -> System.out.println("Não tem aula");
            case QUARTA -> System.out.println("Tem aula");
            default -> System.out.println("Doidera bixo");
        }

        for(Planetas a : Planetas.values()){
            System.out.println(a);
        }

        Baralho b = new Baralho();
        System.out.println(b);
        b.embaralhar();
        System.out.println(b);
    }
}
