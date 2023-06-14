package Marco2.TrabalhoT2.Exercicio2;

public class Main {
	
	public static void main(String[] args) {		
		Aluno aluno1 = new Aluno("Joao Cabreiro", 21, 2.3);
		Aluno aluno2 = new Aluno("Jose da Silva", 20, 6.8);
		Aluno aluno3 = new Aluno("Luan Romeu Lopes", 19, 8.9);
		
		LSE alunos = new LSE();
		alunos.insereInicio(aluno1);
		alunos.insereFim(aluno2);
		alunos.insereFim(aluno3);
		
		alunos.printList();

        PilhaVet alunospilha = new PilhaVet(10);

        alunospilha.inverteLista(alunos);

        System.out.println("////////////////////////////////////////////////////");
        System.out.println("");
        alunos.printList();


	}
}
