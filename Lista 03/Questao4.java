import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Insira o valor de A:");

        n1 = input.nextInt();

        System.out.println("Insira o valor de B:");

        n2 = input.nextInt();

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        for (int i = menor + 1; i < maior; i++){
            if (i % 2 == 1){
                System.out.println("É ímpar: "+ i);
            }
        }
    }
}
