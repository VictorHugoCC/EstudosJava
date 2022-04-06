package aula050422;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        int vetor[][] = new int[3][3];
        int maiorNumero = 0, iMaior = 0, jMaior = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor das matrizes: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vetor[i][j] = scan.nextInt();

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (vetor[i][j] > maiorNumero) {
                    maiorNumero = vetor[i][j];
                    iMaior = i;
                    jMaior = j;
                }
            }
        }
        System.out.println(
                "Maior matriz, que é " + maiorNumero + " esta na posição i " + iMaior + " j " + jMaior);
    }
}
