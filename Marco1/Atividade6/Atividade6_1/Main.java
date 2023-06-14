package Marco1.Atividade6.Atividade6_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LDE lista = new LDE();
        Scanner input = new Scanner(System.in);
        int numremov = 0;

        System.out.println("Adciona 10 números a lista: ");
        for(int i = 0; i < 10; i++){
            lista.insereInicio(input.nextInt());
        }

        lista.print();

        System.out.println("Digite um número para se remover da lista: ");
        numremov = input.nextInt();

        input.close();

        lista.remove(numremov);

        lista.print();

    }
}
