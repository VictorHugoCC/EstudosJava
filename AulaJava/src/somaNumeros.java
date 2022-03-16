import java.util.Scanner;

public class somaNumeros {

    public static void main(String[] args) {

    //Declarando variaveis
    int i, y, soma;
    
    //Criando objeto scan
    Scanner scan = new Scanner(System.in);
   
    //Valor para as variaveis
    System.out.println("Iae porra, digite o primeiro numero");
    i=scan.nextInt();

    System.out.println("Iae porra, digite o segundo numero: ");
    y=scan.nextInt();

    //Soma entre as variaveis
    soma = i + y;

     System.out.println("A soma total foi de: " + soma);
    }
}