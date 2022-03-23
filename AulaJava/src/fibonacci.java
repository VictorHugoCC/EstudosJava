package macaco;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        int i, x = 1, y = 1, soma = 0, limite;

        Scanner scan = new Scanner(System.in);

        // Criando limitador do laço de repitição
        System.out.print("Digite um numero: ");
        limite = scan.nextInt();

        // Ajustando Limitador
        limite = limite - 2;

        // Exibir valor: 0
        System.out.println("" + soma + "");

        // Exibindo primeiros valores
        System.out.println("" + x + "");
        System.out.println("" + y + "");

        for (i = 0; i < limite; i++) {

            // Somando valores
            soma = x + y;

            // Exibir fibonacci
            System.out.println("" + soma + "");

            // Ajustar valor de X
            x = y;

            // Ajustar valor de Y
            y = soma;

        }
    }
}
