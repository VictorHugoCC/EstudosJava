package aula290322;

import java.util.Scanner;

public class checarPrimo {

    public static int primos(int n1, int n2) {
        int maiorNumero = 0, menorNumero = 0, divisor = 0, totalPrimos = 0;

        if (n1 > n2) {
            maiorNumero = n1;
            menorNumero = n2;
        } else {
            maiorNumero = n2;
            menorNumero = n1;
        }

        for (int i = menorNumero; i < maiorNumero; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                System.out.println("Numero primo: " + i);
                totalPrimos++;
            }
            divisor = 0;
        }
        return totalPrimos;
    }

    public static void main(String[] args) {

        int a, b, resultado;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        a = scan.nextInt();

        System.out.println("Digite outro numero: ");
        b = scan.nextInt();

        resultado = primos(a, b);
        System.out.println("Quantia de numeros primo entre  " + a + " e " + b + " é de: " + resultado);
    }
}