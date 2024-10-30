import java.util.Scanner;

public class IndiceMatrizSomaDois {
  public static void main(String[] args) {
    int[][] numeros = new int[3][3];
    int i, j;

    for(i = 0; i < 3; i++) {
      for(j = 0; j < 3; j++) {
        System.out.println("Digite o número da linha " + (i+1) + " e coluna " + (j+1) + ": ");
        numeros[i][j] = new Scanner(System.in).nextInt();
        numeros[i][j] += 2;
      }
    }

    for(i = 0; i < 3; i++) {
      for(j = 0; j < 3; j++) {
        System.out.println("Número na linha " + (i+1) + " e coluna " + (j+1) + ": " + numeros[i][j]);
      }
    }
  }
}
