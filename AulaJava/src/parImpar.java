import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {

    //Declarando variaveis
    int i;
    
    //Criando objeto scan
    Scanner scan = new Scanner(System.in);
   
    //Valor para as variaveis
    System.out.println("Iae porra, digite o primeiro numero");
    i=scan.nextInt();

    //função de verificação
    if (i%2 == 0) {
        System.out.println("O valor "+ i +" é par");
    }else{
        System.out.println("O valor "+ i +" é impar");
        }
    }
}