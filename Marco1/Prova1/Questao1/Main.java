package Marco1.Prova1.Questao1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int aux = 0;
        int add = 0;
        Scanner input = new Scanner(System.in);
        long start = System.currentTimeMillis();

        Vetor num1 = new Vetor();
        Vetor num2 = new Vetor();
        Vetor numfim = new Vetor();

        System.out.println("Quantos números deseja inserir no primeiro vetor: ");
        aux = input.nextInt();
        System.out.println("Adcione os números: ");

        for(int i = 0; i < aux; i++){
            add = input.nextInt();
            num1.adciona(add);
        }

        System.out.println("Quantos números deseja inserir no segundo vetor: ");
        aux = input.nextInt();
        System.out.println("Adcione os números: ");

        for(int i = 0; i < aux; i++){
            add = input.nextInt();
            num2.adciona(add);
        }
        input.close();

        System.out.println("");
        System.out.println("Vetor 1.");
        num1.print();
        System.out.println("");
        System.out.println("Vetor 2.");
        num2.print();

        for(int i = 0; i < num1.tamanho(); i++){
            int findnum = num1.returnNum(i);
            if(num2.find(findnum)){
                numfim.adciona(findnum);
            }
        }

        System.out.println("");
        System.out.println("Vetor fim: Só números presentes nós outros dois vetores são parte dele ");
        numfim.print();
        
        System.out.println("");
        System.out.println("Tempo de execução: " + (System.currentTimeMillis() - start));
    }
}