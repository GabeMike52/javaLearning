import java.util.Scanner; //Lê o input do usuário via terminal/console e ajuda a armazenar isso na variável.

public class MaiorOuNao {
  public static void main(String[] args) {
    //Entrada de Dados
    Scanner read = new Scanner(System.in);
    int n1;
    int n2;
    System.out.println("Digite o primeiro número: ");
    n1 = read.nextInt();
    System.out.println("Digite o segundo número: ");
    n2 = read.nextInt();
    //Processamento e Saída de Dados
    if (n1 > n2) {
      System.out.println("O primeiro número é maior que o segundo!");
    } else {
      System.out.println("O segundo número é maior que o primeiro");
    }
  }
}