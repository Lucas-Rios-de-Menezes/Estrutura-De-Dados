package Marco1.Prova1.Questao9;

class Noh {
    int num;
    Noh next;

    public Noh(int num) {
        this.num = num;
        this.next = null;
    }

    public void setProximo(Noh proximo) { this.next = proximo; }

}