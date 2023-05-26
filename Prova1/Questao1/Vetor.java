package Questao1;

public class Vetor implements Interface{
	private int[] num = new int[2];
	private int total = 0;

	public void adciona(int nume){
		garanteEspaco();
		this.num[total] = nume;
		total++;
	}
	
	public int tamanho() {
		return this.total;
	}

	public int returnNum(int i){
		return num[i];
	}
	
	public void print() {
		for (int i = 0; i < this.total; i++) {
			System.out.print(num[i] + " | ");
		}
	}

	public boolean find(int i){
		for(int o = 0; o < this.total; o++){
			if(i == num[o]){
				return true;
			}
		}
		return false;
	}
	
	public boolean cheio() {
		if (total == this.num.length) {
			return true;
		}
		return false;
	}
	
	private void garanteEspaco() {
		if (cheio() == true) {
			int[] newnum = new int[this.num.length * 2];
			for(int i = 0; i < this.num.length; i++) {
				newnum[i] = this.num[i];
			}
			this.num = newnum;
		}
	}
}