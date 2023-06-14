package Marco1.Prova1.Questao8;

import java.util.Scanner;

public class LDE {

    Scanner in = new Scanner(System.in);

    private int tamanho = 0;
    private Noh inicio;
    private Noh fim;

    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    public void insere(int num) {
        Noh novo = new Noh(num);

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

    public Noh getInicio() {
        return inicio;
    }

    public Noh getFim() {
        return fim;
    }


    public int tamanho() {
        return tamanho;
    }


    public void concat(LDE outralista) {
        if (outralista.inicio != null) {
            if (this.inicio == null) {
                this.inicio = outralista.inicio;
                this.fim = outralista.fim;
            } else {
                this.fim.setProximo(outralista.inicio);
                outralista.inicio.setAnterior(this.fim);
                this.fim = outralista.fim;
            }
        }
    }

    public void print() {
        Noh atual = inicio;
        while (atual != null) {
            System.out.print(atual.getNum() + " || ");
            atual = atual.getProximo();
        }
    }
    
}