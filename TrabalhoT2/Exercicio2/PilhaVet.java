package TrabalhoT2.Exercicio2;

public class PilhaVet implements IPilha {
    private Object[] pilha;
    private int numElem;

    public PilhaVet (int tamanhoVetor){
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }

    public boolean push(Object info){
        if (this.numElem == pilha.length){
            System.out.println("pilha estourou");
            return false;
        }

        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    public Object pop(){
        Object o = null;

        if(this.isEmpty()){
            System.out.println("Pilha vazia");
            return null;
        }

        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }

    public Object top(){
        return this.pilha[this.numElem - 1];
    }

    public boolean isEmpty(){
        if(numElem == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return numElem;
    }

    public void print(){
        for (int i = numElem - 1; i >= 0; i--) {
            System.out.println(pilha[i].toString());
        }
    }

    public LSE inverteLista(LSE lista){
        LSE listaNova = new LSE();
        LSE listaAlunos = lista;
        Noh atual = listaAlunos.returnInicio();
        PilhaVet pilha = new PilhaVet(10);
		
		while(atual != null) {
			push(atual.getInfo());
			atual = atual.getProximo();
		}
        
        while(!pilha.isEmpty()){
            Object aluno = pilha.pop();
            listaNova.insereFim(aluno);
        }

        return listaNova;
    }

}
