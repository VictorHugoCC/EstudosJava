package macaco;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        int x, soma = 1, contador;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        x = scan.nextInt();

        contador = x;

        while (contador > 0) {

            soma = soma * contador;
            --contador;

        }
        System.out.println("Fatorial do numero " + x + " é = " + soma);
    }
}
