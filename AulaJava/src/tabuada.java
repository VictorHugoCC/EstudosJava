import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {

        // Declarando variaveis
        int i = 0, x, soma;

        // Criando objeto scan
        Scanner scan = new Scanner(System.in);

        // Valor para as variaveis
        System.out.println("Ola, tudo bem ? Digite um numero ai");
        x = scan.nextInt();

        // Função de repetição com for
        for (i = 0; i <= 5; i++) {
            soma = i * x;
            System.out.println("O valor " + x + " multiplicado por " + i + " é = " + soma);
        }
        
        System.out.println("Testando com while: ");
        
        // Função de repetição com while
        while (i <= 20) {
            soma = i * x;
            System.out.println("O valor " + x + " multiplicado por " + i + " é = " + soma);
            i++;
        }
    }
}
