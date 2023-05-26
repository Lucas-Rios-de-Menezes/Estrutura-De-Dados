package Questao9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LSE list = new LSE();
        Scanner input = new Scanner(System.in);

        System.out.println("Adciona 10 números a lista: ");
        for(int i = 0; i < 10; i++){
            list.insere(input.nextInt());
        }

        input.close();

        System.out.println("Lista original: ");
        list.print();

        System.out.println("Lista ordenada com bubbleSort: ");
        list.bubbleSort();
        list.print();
        
    }

}