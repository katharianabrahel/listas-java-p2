import java.util.Scanner;

public class Questao5 {
    public static String buscarPosicao(int [] nums, int chave) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == chave){
                return "Chave encontrada na posição: "+ (i+1);
            }
        }
        return "Chave não encontrada!";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];
        int chave;

        for (int i = 0; i < nums.length; i++){
            System.out.println("Insira o dado da posição: "+(i+1)+": ");
            nums[i] = input.nextInt();
        }

        System.out.println("Insira a chave de busca: ");
        chave = input.nextInt();

        System.out.println(buscarPosicao(nums, chave));
    }
}
