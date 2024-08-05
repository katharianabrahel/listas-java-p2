import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Insira o primeiro valor:");

        n1 = input.nextInt();

        System.out.println("Insira o segundo valor");

        n2 = input.nextInt();

        if (n1==n2){
            System.out.println("Multiplicação: "+ (n1*n2));
        } else if (n1>n2) {
            System.out.println("Subtração: "+ (n1-n2));
        } else {
            System.out.println("Soma: "+ (n1+n2));
        }
    }
}
