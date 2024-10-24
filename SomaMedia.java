public class SomaMedia {
    public static void main(String[] args) {
        String nomeAlg;
        float numUm;
        float numDois;
        float numTres;
        float resultadoSoma;
        float media;

        nomeAlg = "Soma e Média";
        numUm = 5;
        numDois = 7;
        numTres = 6;
        resultadoSoma = numUm + numDois + numTres;
        media = resultadoSoma/3;

        System.out.print("Nome do Algoritmo: ");
        System.out.println(nomeAlg);
        System.out.print("Resultado da Soma: ");
        System.out.println(resultadoSoma);
        System.out.print("Resultado da Média: ");
        System.out.println(media);
    }
}
