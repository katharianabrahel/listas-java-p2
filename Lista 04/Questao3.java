import java.util.Scanner;

public class Questao3 {
    public static String parImpar(int n) {
        if (n % 2 == 0){
            return n+" é par.";
        }else{
            return n+" é ímpar.";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Insira um número: ");
        n = input.nextInt();

        System.out.println(parImpar(n));
    }
}
