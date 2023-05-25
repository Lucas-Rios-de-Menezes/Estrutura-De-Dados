package Questao2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sort vetor = new Sort();
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            vetor.adciona(input.nextInt());
        }
        input.close();

        vetor.selectionSort();
        vetor.print();

    }
}
