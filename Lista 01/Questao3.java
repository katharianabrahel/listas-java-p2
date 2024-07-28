import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o salario: ");

        double salario, novoSalario;

        salario = input.nextDouble();
        novoSalario = salario * 1.25;

        System.out.printf("Novo salário: %.2f", novoSalario);

        input.close();
    }
}
