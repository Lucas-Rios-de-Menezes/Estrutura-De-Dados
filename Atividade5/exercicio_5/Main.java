package Atividade5.exercicio_5;

public class Main {
	
	public static void main(String[] args) {		
		Aluno aluno1 = new Aluno("Joao Cabreiro", 21, 2.3);
		Aluno aluno2 = new Aluno("Jose da Silva", 20, 6.8);
		Aluno aluno3 = new Aluno("Luan Romeu Lopes", 19, 8.9);
		
		ILista alunos = new LSE();
		alunos.insereInicio(aluno1);
		alunos.insereFim(aluno2);
		alunos.insereInicio(aluno3);
		
		alunos.printList();
	}
}
