package Atividade9;
import java.util.Random;

public class Vetor {
	private int[] num = new int[5];
    private Random random = new Random();
	
	public void random() {
        for(int i = 0; i < num.length; i++){
            num[i] = random.nextInt(50);
        }
	}

    public void bblSort(){
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length-1; j++){

                if (this.num[j] > this.num[j+1]) {
                    int aux = this.num[j];
                    this.num[j] = this.num[j+1];
                    this.num[j+1] = aux;
                }   
            }
        }
    }

    public void seleSort(){
        for (int i = 0; i < num.length; i++) {
            int menor = i;

            for (int j = i+1; j < num.length; j++){
                if (this.num[j] < this.num[menor])
                menor = j;
            }

            int aux = num[i];
            this.num[i] = this.num[menor];
            this.num[menor] = aux;
            }
        }

    public void inserSort() {
        for (int i = 1; i < num.length; i++) {
            int key = this.num[i];
            int j = i - 1;
            while (j >= 0 && key < this.num[j]) {
                this.num[j + 1] = this.num[j];
                j--;
            }
            this.num[j + 1] = key;
            }
        }

    public void print(){
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
