package Questao5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LDE lista = new LDE();
        Scanner input = new Scanner(System.in);

        System.out.println("Adciona 10 números a lista: ");
        for(int i = 0; i < 10; i++){
            lista.insere(input.nextInt());
        }

        input.close();

        System.out.println("O número de pares da lista é: ");
        System.out.print(lista.nroPares());
    }
    
}
