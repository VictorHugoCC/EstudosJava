package aula290322;

import java.util.Scanner;

public class checarPar {

    public static void main(String[] args) {
        int a, b, i, cont = 0, maiorNumero = 0, menorNumero = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        a = scan.nextInt();

        System.out.println("Digite outro numero: ");
        b = scan.nextInt();

        if (a > b) {
            maiorNumero = a;
            menorNumero = b;
        } else {
            maiorNumero = b;
            menorNumero = a;
        }

        for (i = menorNumero; i < maiorNumero; i++) {
            if (i % 2 == 0) {

                cont++;
            }
        }
        System.out.println("Quantia de numeros pares emtre  " + a + " e " + b + " é de: " + cont);
    }
}
