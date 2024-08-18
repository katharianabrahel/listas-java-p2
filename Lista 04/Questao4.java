import java.util.Scanner;

public class Questao4 {
    public static void dividir100(double [] nums) {
        System.out.println("Conteúdo dividido por 100: ");
        for (int i = 0; i < 5; i++){
            System.out.println(nums[i]/100);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double [] nums = new double[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Insira o dado da posição "+ (i+1) +": " );
            nums[i] = input.nextInt();
        }

       dividir100(nums);
    }
}
