import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Insira o primeiro número:");

        n1 = input.nextInt();

        System.out.println("Insira o segundo número:");

        n2 = input.nextInt();

        if (n1 > n2){
            System.out.println("O maior número é: "+ n1);
        } else if (n2 > n1) {
            System.out.println("O maior número é: "+ n2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}