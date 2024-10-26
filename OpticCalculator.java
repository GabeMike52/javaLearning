import java.util.Scanner;
public class OpticCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double velFase;
        double comprimentoDeOnda;
        double indiceDeRefracao;
        double velLuz = 300000000;
        double aberturaNum;
        byte option;
        do {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Velocidade de fase");
            System.out.println("2 - Comprimento de onda");
            System.out.println("3 - Índice de refração");
            System.out.println("4 - Abertura numérica");
            System.out.println("5 - ");
            option = read.nextByte();
            if (option == 1) {
                System.out.println("Velocidade de Fase");
                System.out.println("Digite o valor que representa a permeabilidade magnética do material sem notação: ");
                double permeabilidadeMagnetica = read.nextDouble();
                System.out.println("Digite o valor que representa a permissividade elétrica do material sem notação: ");
                double permissividadeEletrica = read.nextDouble();
                double sqrt = Math.sqrt(permeabilidadeMagnetica*permissividadeEletrica);
                velFase = 1/sqrt;
                System.out.println("A velocidade de fase é igual a: " + velFase);
            } else if (option == 2) {
                System.out.println("Comprimento de Onda");
                System.out.println("Digite o valor da velocidade de fase sem notação: ");
                velFase = read.nextDouble();
                System.out.println("Digite a frequência: ");
                double freq = read.nextDouble();
                comprimentoDeOnda = velFase/freq;
                System.out.println("O comprimento de onda é igual a: " + comprimentoDeOnda);
            } else if (option == 3) {
                System.out.println("Índice de Refração: ");
                System.out.println("Digite o valor da velocidade de fase sem notação: ");
                velFase = read.nextDouble();
                indiceDeRefracao = velLuz/velFase;
                System.out.println("O índice de refração é igual a: " + indiceDeRefracao);
            } else if (option == 4) {
                System.out.println("Abertura Numérica");
                byte optionAberturaNum;
                System.out.println("Digite o índice de refração no núcleo: ");
                double indiceRefracaoNucleo = read.nextDouble();
                System.out.println("Digite a fórmula desejada: ");
                System.out.println("1 - Índice de refração no núcleo * raiz de 1 - (índice de refração na casca sobre índice de refração no núcleo)");
                System.out.println("2 - Raiz do (índice de refração no núcleo ao quadrado - índice de refração na casca ao quadrado)");
                System.out.println("3 - Índice de refração no núcleo * raiz de (2*Delta)");
                optionAberturaNum = read.nextByte();
                if (optionAberturaNum == 1) {
                    System.out.println("Digite o índice de refração na casca: ");
                    double indiceRefracaoCasca = read.nextDouble();
                    aberturaNum = indiceRefracaoNucleo * Math.sqrt(1-(indiceRefracaoCasca/indiceRefracaoNucleo));
                    System.out.println("A abertura numérica é igual a: " + aberturaNum);
                } else if (optionAberturaNum == 2) {
                    System.out.println("Digite o índice de refração na casca: ");
                    double indiceRefracaoCasca = read.nextDouble();
                    aberturaNum = Math.sqrt((indiceRefracaoNucleo*indiceRefracaoNucleo)-(indiceRefracaoCasca*indiceRefracaoCasca));
                    System.out.println("A abertura numérica é igual a: " + aberturaNum);
                } else if (optionAberturaNum == 3) {
                    System.out.println("Digite o valor de delta: obs.: delta = Nmaior - Nmenor");
                    double delta = read.nextDouble();
                    aberturaNum = indiceRefracaoNucleo * Math.sqrt(2*delta);
                    System.out.println("A abertura numérica é igual a: " + aberturaNum);
                }
            }
        } while (option < 6);
    }
}