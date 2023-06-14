package Marco1.Atividade6.Atividade6_2;

import java.util.Scanner;

public class LDE implements ILista {

    Scanner in = new Scanner(System.in);

    private int tamanho = 0;
    private Noh inicio;
    private Noh fim;

    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    public Noh getInicio() {
        return inicio;
    }

    public Noh getFim() {
        return fim;
    }

    public void insereInicio(Object o) {
        Noh novo = new Noh(o);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
        tamanho++;
    }

    public void insereFim(Object o) {
        Noh novo = new Noh(o);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
        tamanho++;
    }

    public int tamanho() {
        return tamanho;
    }

    public void print() {
        Noh atual = inicio;
        while (atual != null) {
            System.out.println(atual.getObjeto());
            System.out.println();
            atual = atual.getProximo();
        }
    }
}