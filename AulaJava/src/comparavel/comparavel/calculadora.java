import java.util.Scanner;

public class calculadora
{
        private double n1;
        private double n2;
        private char op;
        
        public calculadora(double numero1, double numero2, char operacao)
    {
        this.n1 = numero1;
        this.n2 = numero2;
        this.op = operacao;
    }
        
    public double calcular(){
        switch(op){
            case'+':
                return n1 + n2;
            case'-':
                return n1 - n2;
            case'/':
                if(n2 == 0){
                    System.out.println("ERROR");
                }
                return n1/n2;
            case'*':
                return n1*n2;
            default :
                return -0;
        }   
    }
    
        
    public void setValor(double numero1)
    {
        n1 = numero1;
    }
    
    public void setValor2(double numero2)
    {
        n2 = numero2;
    }
    
      public void setOP(char operacao)
    {
        op = operacao;
    }
        
     public double getValor()
    {
        return n1;
    }
    
     public double getValor2()
    {
        return n2;
    }
    
    public char getOP()
    {
        return op;
    }
}

