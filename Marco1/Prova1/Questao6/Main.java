package Marco1.Prova1.Questao6;
import java.util.Scanner;

//Exercício incompleto

public class Main {
    public static void main(String[] args) {
        LDE lista = new LDE();
        Scanner input = new Scanner(System.in);

        System.out.println("Adciona 10 números a lista: ");
        for(int i = 0; i < 10; i++){
            lista.insere(input.nextInt());
        }

        input.close();

        lista.print();
        
    }
    
}
