package Questao5;

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


    public int nroPares() {
        int pares = 0;
        Noh atual = inicio;
        while (atual != null) {
            if((atual.getNum() % 2) == 0){
                pares++;
            }
            atual = atual.getProximo();
        }
        return pares;
    }
    
}