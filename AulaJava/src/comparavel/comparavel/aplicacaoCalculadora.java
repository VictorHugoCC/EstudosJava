import java.util.Scanner;

public class aplicacaoCalculadora
{
    public static void main(String[]args)
    {
        int n1, n2;
        char op;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe um numero: ");
        n1 = entrada.nextInt();
        
        System.out.println("informe outro numero: ");
        n1 = entrada.nextInt();
        
        System.out.println("informe um dos operadores (+, -, *, /): ");
        n1 = entrada.next().charAt(0);
        
        calculadora obj = new calculadora(n1,n2,op);
        
        obj.calcular();
        
        obj.imprime();
        
    }
}
