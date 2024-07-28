import java.util.Scanner;
import java.lang.Math;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, potencia;

        System.out.println("Insira o primeiro número:");
        num1 = input.nextDouble();
        while (num1 < 0) {
            System.out.println("O número deve ser maior que 0. Digite o primeiro número novamente");
            num1 = input.nextDouble();
        }

        System.out.println("Insira o segundo número:");
        num2 = input.nextDouble();
        while (num2 < 0) {
            System.out.println("O número deve ser maior que 0. Digite o segundo número novamente");
            num2= input.nextDouble();
        }

        potencia = Math.pow(num1, num2);

        System.out.printf("Resultado: %.2f", potencia);

        input.close();
    }
}
