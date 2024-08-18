import java.util.Scanner;

public class Questao2 {
    public static String isFirstGreater(int[] nums) {
        if (nums[0] > nums[1] && nums[0] > nums[2]){
            return "Condição Satisfeita";
        } else {
            return "Erro";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] nums = new int[3];

        System.out.println("Insira o primeiro número: ");
        nums[0] = input.nextInt();
        System.out.println("Insira o segundo número: ");
        nums[1] = input.nextInt();
        System.out.println("Insira o terceiro número: ");
        nums[2] = input.nextInt();

        System.out.println(isFirstGreater(nums));
    }
}
