package Atividade12;

public class FilaLista implements IFila {
    private Noh inicio;
    private Noh fim;
    private int size = 0;

    public FilaLista () {
        this.inicio = null;
        this.fim = null;
    }

    public boolean add(Object info){ 
        Noh novo = new Noh(info);
        if (this.isEmpty()){
            inicio = novo;
        } else{
            fim.setProximo(novo);
        }
        fim = novo;
        size++;
        return true;
    }

    public boolean remove(){
        if (!isEmpty()){
            if (inicio == fim) {
            inicio = null;
            fim = null;
            }else{
            inicio = inicio.getProx();
            return true;
            }
            size--;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    public void print() {
        Noh atual = inicio;
        while (atual != null) {
            System.out.println(atual.getInfo());
            System.out.println();
            atual = atual.getProx();
        }
    }

}
