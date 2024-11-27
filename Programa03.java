import javax.swing.*;

public class Programa03 {
    public static void main(String[] args) {
        //Declaração de variáveis
        int n1, n2, mod;
        double raiz1, raiz2;
        String msg = "";
        //Entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
        //Processamento de dados
        mod = n1 % n2;
        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);
        //Saída de dados
        msg = "N1 = " + n1 + " e N2 = " + n2 + "\n";
        msg += "raiz quadrada de " + n1 + " = " + raiz1 + "\n";
        msg += "raiz quadrada de " + n2 + " = " + raiz2 + "\n";
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
