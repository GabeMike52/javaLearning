import java.util.Scanner;

public class DoWhileLoopMultiply {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int multiplicacao = 1;
        int i = 1;
        do {
            System.out.println("Digite um número para ser multiplicado: ");
            int num = read.nextInt();
            multiplicacao = multiplicacao*num;
            i++;
        }
        while(i<6);
        System.out.println("Resultado da multiplicação: " + multiplicacao);
    }
}