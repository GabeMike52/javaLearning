import java.util.Scanner;

public class MediaComEntrada {
    public static void main(String[] args) {
        //Entrada de Dados
        Scanner obj = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        float soma;
        float media;
        System.out.println("Digite sua primeira nota: ");
        num1 = obj.nextFloat();
        System.out.println("Digite sua segunda nota: ");
        num2 = obj.nextFloat();
        System.out.println("Digite sua terceira nota: ");
        num3 = obj.nextFloat();

        //Processamento de Dados
        soma = num1 + num2 + num3;
        media = soma/3;

        //Saída de Dados
        System.out.println("Suas notas foram: " + num1 + ", " + num2 + " e " + num3);
        System.out.println("A soma das suas notas foi: " + soma);
        System.out.println("A sua média final foi: " + media);
    }
}