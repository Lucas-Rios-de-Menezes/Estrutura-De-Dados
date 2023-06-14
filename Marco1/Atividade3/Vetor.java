package Marco1.Atividade3;

public class Vetor {
	private Aluno[] alunos = new Aluno[5];
	private int totalAlunos = 0;
	
	public void adciona(Aluno aluno) {
		this.alunos[this.totalAlunos] = aluno;
		this.totalAlunos++;
	}
	
	public int tamanho() {
		return this.totalAlunos;
	}
	
	public boolean contem(String nome) {
		for (int i = 0; i < this.totalAlunos; i++) {
			if (nome.equals(this.alunos[i].getNome())){
				return true;
			}
		}
		return false;
	}

}
