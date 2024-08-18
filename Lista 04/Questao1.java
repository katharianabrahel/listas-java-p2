import java.util.Scanner;

public class Questao1 {
    public static String maior(int n1, int n2) {
        if (n1 > n2){
            return "O maior é: "+n1;
        } else if (n2 > n1) {
            return "O maior é: "+n2;
        }else{
            return "Os números são iguais.";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Insira o primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Insira o segundo número: ");
        n2 = input.nextInt();

        System.out.println(maior(n1, n2));
    }
}