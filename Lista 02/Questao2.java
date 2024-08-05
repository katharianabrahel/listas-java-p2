import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Insira o primeiro número:");

        n1 = input.nextInt();

        System.out.println("Insira o segundo número:");

        n2 = input.nextInt();

        System.out.println("Insira o terceiro número:");

        n3 = input.nextInt();

        if (n1 > n2 && n2 > n3){
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }
}
