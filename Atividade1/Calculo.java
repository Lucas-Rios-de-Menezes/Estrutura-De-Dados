package Atividade1;
import java.util.Scanner;

public class Calculo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double xa, xb, yb, ya;
		
		System.out.println("Digite dois numeros que representam o ponto X: ");
		xb = input.nextDouble();
		System.out.println("////");
		xa = input.nextDouble();
		
		System.out.println("Digite dois numeros que representam o ponto Y: ");
		yb = input.nextDouble();
		System.out.println("////");
		ya = input.nextDouble();
		
		PontoCartesiano pontocar = new PontoCartesiano(xb, xa, yb, ya);
		
		pontocar.distanciaEuclidiana();
		
	}

}
