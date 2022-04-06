package aula050422;

import java.util.Scanner;

public class vetorPrimos {

    public static void main(String[] args) {
        int vetor[] = new int[8];
        int divisor = 0, totalPrimos = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o valor do VETOR " + i + " : ");
            vetor[i] = scan.nextInt();

        }

        for (int i = 0; i < 8; i++) {
            for (int j = 1; j <= vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    divisor++;
                }

            }
            if (divisor == 2) {
                System.out.println("Numero primo: " + vetor[i] + " e esta na posição: " + i);

                totalPrimos++;
            }
            divisor = 0;
        }
        System.out.println("Quantia de numeros primo: " + totalPrimos);

    }

}
