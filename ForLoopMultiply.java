import java.util.Scanner;
public class ForLoopMultiply {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int multiplicacao = 1;
        for(int i = 1; i<6; i++) {
            System.out.println("Digite um número à ser multiplicado: ");
            int num = read.nextInt();
            multiplicacao = multiplicacao*num;
        }
    System.out.println("Resultado da multiplicação: " + multiplicacao);
    }
}
