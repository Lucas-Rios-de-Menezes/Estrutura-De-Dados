package Marco1.Atividade4;

public class Vetor implements IVetorAluno{
	private Aluno[] alunos = new Aluno[2];
	private int totalAlunos = 0;
	
	public void adciona(Aluno aluno) {
		this.garanteEspaco();
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
	
	public boolean cheio() {
		if (totalAlunos == this.alunos.length) {
			return true;
		}
		return false;
	}
	
	private void garanteEspaco() {
		if (cheio() == true) {
			Aluno[] novoAlunos = new Aluno[this.alunos.length * 2];
			for(int i = 0; i < this.alunos.length; i++) {
				novoAlunos[i] = this.alunos[i];
			}
			this.alunos = novoAlunos;
		}
	}
	
	public boolean remove(String nome){
		int indice = -1;
		int i = 0;
		for (i = 0; i < totalAlunos; i++) {
			if(nome.equals(this.alunos[i].getNome())) {
				indice = i;
				break;
			}
		}
			if (indice != -1) {
				for(i = indice; i<(totalAlunos-1);) {
					alunos[i] = alunos[i+1];
					totalAlunos--;
					return true;
				}
			}
		return false;
		}
	}
