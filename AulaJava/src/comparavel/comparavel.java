public class comparavel
{
    private int valor;
    
    public comparavel(int numero)
    {
        this.valor = numero;
    }
    
    public boolean maiorOuIgual(int numero)
    {
        if(numero>=valor)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean menorOuIgual(int numero)
    {
        if(numero<=valor)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean diferenteDe(int numero)
    {
        if(numero!=valor)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void setValor(int numero)
    {
        valor = numero;
    }
    
    public int getValor()
    {
        return valor;
    }
    
        
        
    
    
    
}
