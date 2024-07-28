import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Insira a base:");
        base = input.nextDouble();

        System.out.println("Insira a altura:");
        altura = input.nextDouble();

        area = (base * altura)/2;

        System.out.printf("Área do triângulo: %.2f", area);

        input.close();
    }
}
