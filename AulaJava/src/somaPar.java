package aula290322;

import java.util.Scanner;

public class somaPar {
    public static void main(String[] args) {
        int i, a, par = 0, parSoma = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Começando operação... ");

        // Criando laço de repetição

        for (i = 0; i < 10; i++) {

            System.out.println("Digite um numero: ");
            a = scan.nextInt();

            // Checando Numero par

            if (a % 2 == 0) {
                par++;
                parSoma = parSoma + a;

                System.out.println("Soma total: " + parSoma);
            }
        }
        System.out.println(
                "A soma total de pares foi igual a " + parSoma + " e foram no total " + par + " pares somados");
    }
}
