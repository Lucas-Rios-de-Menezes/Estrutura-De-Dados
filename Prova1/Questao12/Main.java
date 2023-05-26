package Questao12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.println("Número inserido ao somatório: ");
        i = input.nextInt();
        input.close();

        System.out.println("Resultado do somatório: ");
        System.out.println(Somatorio.somatorio(i));

    }
    
}