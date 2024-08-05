import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = -1, qtd_positivos = 0;

        while (num != 0) {
            System.out.println("Insira um número: ");
            num = input.nextInt();
            if (num > 0) {
                qtd_positivos += 1;
            }
        }

        System.out.println("Quantidade de positivos: "+ qtd_positivos);
    }
}
