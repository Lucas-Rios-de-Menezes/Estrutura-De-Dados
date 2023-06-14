package Marco1.Prova1.Questao8;

public class Noh {
    private int num;
    private Noh anterior;
    private Noh proximo;

    public Noh(int num) {
        
        this.num = num;
        this.anterior = null;
        this.proximo = null;
        
    }

    public int getNum() { return num; }
    public Noh getAnterior() { return anterior; }
    public Noh getProximo() { return proximo; }

    public void setAnterior(Noh anterior) { this.anterior = anterior; }
    public void setProximo(Noh proximo) { this.proximo = proximo; }
}
