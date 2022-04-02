package estudos;

import java.util.Scanner;

public class fatorial {

    public static void main(String[] args) {
        int i, a, soma = 1, fatorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("diginte um numero");
        a = scanner.nextInt();

        for (i = 1; i < a; i++) {

            fatorial = fatorial * i;

        }

        System.out.println("FATORIAL" + fatorial);

    }

}
