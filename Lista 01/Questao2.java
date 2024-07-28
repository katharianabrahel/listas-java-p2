import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe três notas, em sequência:");

        double nota1, nota2, nota3, media;

        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        System.out.printf("Média aritmética: %.2f", media);

        input.close();
    }
}
