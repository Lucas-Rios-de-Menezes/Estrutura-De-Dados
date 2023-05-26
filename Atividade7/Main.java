package Atividade7;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        vetor.random();

        long start = System.nanoTime();
        System.out.println("O maior número é: " + vetor.maiorIt());
        System.out.println("Tempo de execução(Iterativo): " + (System.nanoTime() - start));

        start = System.nanoTime();
        System.out.println("O maior número é: " + vetor.maiorRec(vetor, 0, 4));
        System.out.println("Tempo de execução(Recursivo): " + (System.nanoTime() - start));

    }
}
