package macaco;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        int idade;
        Scanner scan = new Scanner(System.in);

        System.out.println("Classificação de sua pessoa pela sua idade: ");
        idade = scan.nextInt();

        // Criando Função de checagem "IF-ELSE"

        if (idade >= 9 && idade <= 11) {

            System.out.println("A idade digitada foi " + idade + " e é classificado como menor de idade. ");

        } else if (idade > 11 && idade <= 13) {

            System.out.println("A idade digitada foi " + idade + " e é classificado como pre-adolescente. ");

        } else if (idade > 13 && idade <= 15) {

            System.out.println("A idade digitada foi " + idade + " e é classificado como adolescente. ");

        } else if (idade > 15 && idade <= 18) {

            System.out.println("A idade digitada foi " + idade + " e é classificado como Jovem adulto. ");

        } else if (idade > 18 && idade <= 21) {
            System.out.println("A idade digitada foi " + idade + " e é classificado como adulto. ");

        } else {

            System.out.println(
                    "ERROR, a idade digitada não entra em nenhum dos parametros, por favor checar valor digitado: "
                            + idade);

        }
    }
}
