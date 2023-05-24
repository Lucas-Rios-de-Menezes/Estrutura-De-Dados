package Atividade3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		Vetor vetAlunos = new Vetor();
		
		Aluno aluno1 = new Aluno("Joao Cabreiro", 21, 2.3);
		Aluno aluno2 = new Aluno("Jose da Silva", 20, 6.8);
		Aluno aluno3 = new Aluno("Luan Romeu Lopes", 19, 8.9);
		
		vetAlunos.adciona(aluno1);
		vetAlunos.adciona(aluno2);
		vetAlunos.adciona(aluno3);
		
		System.out.println("A quantidade de alunos e: " + vetAlunos.tamanho());
		
		System.out.println("Que aluno deseja pesquisar se faz parte da lista: (digite seu nome)");
		nome = input.nextLine();
		
		if(vetAlunos.contem(nome)) {
			System.out.println("Aluno encontrado na lista.");
		}else {
			System.out.println("Aluno nao encontrado na lista.");
		}
		
	}

}
