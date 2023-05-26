package Questao8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LDE lista1 = new LDE();
        LDE lista2 = new LDE();
        Scanner input = new Scanner(System.in);

        System.out.println("Adciona 5 números a lista: ");
        for(int i = 0; i < 5; i++){
            lista1.insere(input.nextInt());
        }

        System.out.println("Adciona 5 números a segunda lista: ");
        for(int i = 0; i < 5; i++){
            lista2.insere(input.nextInt());
        }

        input.close();

        lista1.concat(lista2);
        lista1.print();

    }
    
}
