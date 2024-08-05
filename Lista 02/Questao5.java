import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, operacao;

        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");

        operacao = input.nextInt();

        System.out.println("Insira o primeiro valor");

        n1 = input.nextInt();

        System.out.println("Insira o segundo valor");

        n2 = input.nextInt();

        switch (operacao){
            case 1:
                System.out.println("Soma: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Subtração: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Multiplicação: "+ (n1*n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.println("Divisão: "+ (n1/n2));
                } else {
                    System.out.println("Divisão por 0");
                }
        }
    }
}
