package Marco1.Prova1.Questao2;

public class Sort {
    private int[] valor = new int[10];
    private int total = 0;

    public void adciona(int nume){
		this.valor[total] = nume;
        total++;
	}

    public void print() {
		for (int i = 0; i < 10; i++) {
			System.out.print(valor[i] + " | ");
		}
	}

    public void selectionSort () {
     for (int i = valor.length - 1; i >= 0; i--) {
            int maior = this.posMaior(i);
              if (maior != i) 
                 this.troca (i, maior);
           }
     }

     private int posMaior (int fim) {
        int maior = fim;
        for (int i = fim-1; i >= 0; i--)
           if (valor[i] > valor[maior])
              maior = i;
        return maior;
     }

     private void troca (int a, int b) {
        int aux;
        aux = valor[a];
        valor[a] = valor[b];
        valor[b] = aux;
     }
     
    
}
