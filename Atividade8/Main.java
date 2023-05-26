package Atividade8;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        vetor.popularOrdem();

        long start = System.nanoTime();
        vetor.binaryIt(1000);
        System.out.println("Tempo de execução(Iterativo): " + (System.nanoTime() - start));

        start = System.nanoTime();
        vetor.binaryRec(vetor, 1000, 0, 0);
        System.out.println("Tempo de execução(Recursão): " + (System.nanoTime() - start));

    }
}
