package Questao3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.println("Qual algarismo da sequência Fibonnaci deseja ver: ");
        i = input.nextInt();
        System.out.println(fibonacci.calculo(i));
        input.close();
    }
}
