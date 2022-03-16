import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {

    //Declarando variaveis
    int i=0, x, soma;
    
    //Criando objeto scan
    Scanner scan = new Scanner(System.in);
    
    //Valor para as variaveis
    System.out.println("Iae porra, digite um numero ai");
    x=scan.nextInt();

    //Função de repetição com for
    for (i = 0; i < 10; i++) {
        soma = i*x;
        System.out.println("O valor "+x+" multiplicado por "+i+" é = "+soma);
        }

        System.out.println("Testando com while:");
        
    //Função de repetição com while
    while (i<=20) {
        soma = i*x;
        i++;
        System.out.println("O valor "+x+" multiplicado por "+i+" é = "+soma);
        }
    }
}