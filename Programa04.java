import javax.swing.*;

public class Programa04 {
    public static void main(String[] args) {
        //Variáveis
        int n1, n2, resultadoDivisao;
        double potencia;
        String msg = "";
        //Entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
        //Processamento de dados
        resultadoDivisao = (int)n1 / (int)n2;
        potencia = Math.pow(n1, n2);
        //Saída de dados
        msg = "N1 = " + n1 + " e N2 = " + n2 + "\n";
        msg += "Quociente da divisão de " + n1 + " por " + n2 + " = " + resultadoDivisao + "\n";
        msg += n1 + " elevado à " + n2 + " = " + potencia;
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
