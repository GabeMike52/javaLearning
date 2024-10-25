import java.util.Scanner;
public class WhileLoopMultiply {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int produto = 1;
        int num;
        int i = 0;
        while(i < 5) {
            System.out.println("Digite um número a ser multiplicado: ");
            num = read.nextInt();
            produto *= num;
            i++;
        }
    System.out.println("O produto da multiplicação foi: " + produto);
    }
}