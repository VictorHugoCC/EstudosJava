package macaco;

import java.util.Locale;

public class delimitador {
    public static void main(String[] args) {

        // declarando valor em double
        double x = 15.9865;

        System.out.println(x);

        // delimitando valor para duas casas decimais
        System.out.printf("%.2f%n", x);

        // delimitando valor para quatro casas decimais
        System.out.printf("%.4f%n", x);
        
        // localizando valores para US
        Locale.setDefault(Locale.US);

    }
}
