package aula050422;

import java.util.Scanner;

public class matrizDiagonal {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int SomaDiagonal = 0, somaDiagonalIn = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os valores: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scanner.nextInt();
                if (i == j) {

                    SomaDiagonal = SomaDiagonal + matriz[i][j];

                }
                if (i + j == matriz.length - 1) {
                    somaDiagonalIn = somaDiagonalIn + matriz[i][j];
                }

            }
        }
        System.out.print("Soma diagonal: " + SomaDiagonal + "\nSoma diagonal inverso: " + somaDiagonalIn);
    }

}
