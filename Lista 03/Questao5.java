import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        boolean primo = true;

        System.out.println("Insira um número");

        num = input.nextInt();

        if (num <=1){
            primo = false;
        }

        for (int i = 2; i < Math.sqrt(num); i++){
            if (num % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
    }
}
