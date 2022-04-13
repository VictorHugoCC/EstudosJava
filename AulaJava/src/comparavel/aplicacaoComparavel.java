import java.util.Scanner;

public class aplicacaoComparavel

{
    public static void main(String[] args)
    {
        int n1, n2;
        comparavel obj;
        boolean verifica;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite um valor: ");
        n1 = entrada.nextInt();
        
        obj = new comparavel(n1);
        
        System.out.println("digite outro valor: ");
        n2 = entrada.nextInt();
        
        verifica = obj.maiorOuIgual(n2);
        
        if(verifica==false){
            System.out.println(n1+" é MAIOR ou igual a: "+n2);
        }
        else
        {
            System.out.println(n1+" NÂO é MAIOR ou igual a: "+n2);
        }
        
        verifica = obj.menorOuIgual(n2);
        
        if(verifica==false){
            System.out.println(n1+" é MENOR ou igual a: "+n2);
        }
        else
        {
            System.out.println(n1+" NÂO é MENOR ou igual a: "+n2);
        }
        
        verifica = obj.diferenteDe(n2);
        
        if(verifica==true){
            System.out.println(n1+" é Diferente de: "+n2);
        }
        else
        {
            System.out.println(n1+" NÂO é Diferente de: "+n2);
        }
        
    }
}
