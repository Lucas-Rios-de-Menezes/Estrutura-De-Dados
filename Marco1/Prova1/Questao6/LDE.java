package Marco1.Prova1.Questao6;

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

        if (tamanho == 0){
            inicio = novo;
            fim = novo;
        }

        Noh atual = inicio;
        while (atual != null && atual.getNum() < num){
            atual = atual.getProximo();

        }

        if (atual == null){
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }else if (atual == inicio){
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }else{
            novo.setAnterior(atual.getAnterior());
            novo.setProximo(atual);
            atual.setAnterior(novo);
            atual.setProximo(novo);
            atual.setAnterior(novo);
        }

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


    public void print() {
        Noh atual = inicio;
        while (atual != null) {
            System.out.print(atual.getNum() + " || ");
            atual = atual.getProximo();
        }

    }
    
}