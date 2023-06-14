package Marco2.Atividade12;

class Noh {
    private Object info;
    private Noh next;

    public Noh(Object info) {
        this.info = info;
        this.next = null;
    }

    public Object getInfo(){return info;}
    public Noh getProx(){return next;}
    public void setProximo(Noh proximo) { this.next = proximo; }

}
