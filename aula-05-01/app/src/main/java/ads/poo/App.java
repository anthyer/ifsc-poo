/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        matriz[0][0] = 1;

        System.out.println("Atividade 01");
        //TODO usar o tamanho da matriz e não estático
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Atividade 02");

        do {
            System.out.println("Insira um número de linhas e colunas para criar uma matriz identidade(min 3, máx 10): ");
            String input = scanner.nextLine();

            try {
                numero = Integer.parseInt(input);

                if (numero < 3 || numero > 10) {
                    System.out.println("Por favor, digite um numero entre 3 e 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números!");
            }
        } while (numero < 3 || numero > 10);

        int[][] matriz2 = new int[numero][numero];
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(matriz2[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
