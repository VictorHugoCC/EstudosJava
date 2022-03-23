package macaco;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        int i, x = 0, soma = 1, limite;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        limite = scan.nextInt();

        System.out.println("" + soma + "");

        for (i = 0; i < limite; i++) {

            soma = x + soma;
            System.out.println("" + soma + "");
            x = soma - x;

        }
    }
}
