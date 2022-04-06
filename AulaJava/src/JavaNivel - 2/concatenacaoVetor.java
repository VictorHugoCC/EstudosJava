package aula050422;

import java.util.Scanner;

public class concatenacaoVetor {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int vetor[] = new int[5];
        int vetor2[] = new int[5];
        int vetor3[] = new int[10];

        Scanner scan = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.println("Digite os valores do primeiro vetor: ");
            vetor[i] = scan.nextInt();

        }

        for (i = 0; i < 5; i++) {
            System.out.print("Agora, do segundo vetor: ");
            vetor2[i] = scan.nextInt();

        }
        for (i = 0; i < 10; i += 2) {
            vetor3[i] = vetor[j];
            vetor3[i + 1] = vetor2[j];
            j++;
        }

        for (i = 0; i < 10; i++) {
            System.out.println("Imprimindo concatenação: " + vetor3[i]);
        }
    }

}
