import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3 , num4, soma;

        System.out.println("Informe quatro números, em sequência:");

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();

        soma = num1 + num2 + num3 + num4;

        System.out.println("Resultado da soma: " + soma);

        input.close();
    }
}
