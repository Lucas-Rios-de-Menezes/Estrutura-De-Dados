package Questao7;

class Noh {
    int num;
    Noh next;

    public Noh(int num) {
        this.num = num;
        this.next = null;
    }

    public void setProximo(Noh proximo) { this.next = proximo; }

}