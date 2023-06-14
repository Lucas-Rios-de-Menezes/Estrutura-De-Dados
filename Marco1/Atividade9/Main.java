package Marco1.Atividade9;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        vetor.random();

        long start = System.nanoTime();
        vetor.bblSort();
        System.out.println("Tempo de execução(BubbleSort): " + (System.nanoTime() - start));

        start = System.nanoTime();
        vetor.seleSort();
        System.out.println("Tempo de execução(Seleção): " + (System.nanoTime() - start));

        start = System.nanoTime();
        vetor.inserSort();
        System.out.println("Tempo de execução(Inserção): " + (System.nanoTime() - start));

    }
}
