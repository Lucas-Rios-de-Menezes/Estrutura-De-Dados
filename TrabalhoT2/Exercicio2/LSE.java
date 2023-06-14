package TrabalhoT2.Exercicio2;

public class LSE implements ILista {
	
	private Noh inicio;
	private int tamanho = 0;
	
	public LSE () {
		this.inicio = null;
	}
	
	public void insereInicio(Object o) {
		Noh novo = new Noh(o);
		if (inicio == null) {
			inicio = novo;
		}else {
			novo.setProximo(inicio);
			inicio = novo;
		}
		tamanho++;
	}

    public Noh returnInicio(){
        return inicio;
    }
	
	public void insereFim(Object info) {
		Noh novo = new Noh(info);
		if (inicio == null) {
			inicio = novo;
		}else {
			Noh ultimo = null;
			for(Noh i=inicio; i != null; i=i.getProximo()) {
				ultimo = i;
			}
			ultimo.setProximo(novo);
		}
	}
	
	public boolean estahVazia() {
		if(inicio == null) {
			return true;
		}
		return false;
	}
	
	public boolean remove(Object info) {
		Noh ant = null, p;
		p = inicio;
		while (p!=null && p.getInfo() != info) {
			ant = p;
			p = p.getProximo();
		}
		if (p==null) {
			return false;
		}if(ant==null) {
			inicio = p.getProximo();
		}else {
			ant.setProximo(p.getProximo());
		}
		return true;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public void printList() {
		Noh atual = inicio;
		
		while(atual != null) {
			System.out.println(atual.getInfo().toString());
			System.out.println();
			atual = atual.getProximo();
		}
	}

}

