import java.util.Scanner;

public class MediaTurmaNotas {
  public static void main(String[] args) {
    String [] nomes;
    nomes = new String[ 5 ];
    double [] notas = new double[ 5 ];
    double soma = 0, mediaTurma = 0;
    int j = 1;

    for(int i = 0; i <= 4; i++) {
      System.out.print("Digite o nome do(a) aluno(a) de número " + (i+1) + " de 5: ");
      nomes[i] = new Scanner(System.in).nextLine();
      System.out.println(nomes[i]);
      System.out.print("Digite a nota do(a) aluno(a) " + nomes[i] + ": ");
      notas[i] = new Scanner(System.in).nextDouble();
      soma += notas[i];
      j += 1;
    };

    mediaTurma = soma / 5;
    for(int c = 0; c <= 4; c++) {
      System.out.println("A nota do(a) aluno(a) " + nomes[c] + " foi: " + notas[c] + ".");
    }
    System.out.println("A média da turma foi: " + mediaTurma + ".");
  }
} 
