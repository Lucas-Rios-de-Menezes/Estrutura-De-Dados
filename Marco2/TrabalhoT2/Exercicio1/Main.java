package Marco2.TrabalhoT2.Exercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PilhaVet pilha = new PilhaVet(20);
        Scanner input = new Scanner(System.in);
        String palavra;

        palavra = input.nextLine();

        if (pilha.palindromo(palavra)){
            System.out.println("Eh um palindromo.");
        }else{
            System.out.println("Nao eh um palindromo.");
        }
        
        input.close();
    }

}
