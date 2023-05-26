package Questao9;

public class LSE{
    Noh conexao;

    public LSE(){
        this.conexao = null;
    }

    public void insere(int num) {
        Noh novo = new Noh(num);
        
        if (conexao == null) {
            conexao = novo;
        } else {
            novo.next = conexao;
            conexao = novo;
        }
    }

    public void print() {
        Noh atual = conexao;
        while (atual != null) {
            System.out.print(atual.num + " || ");
            atual = atual.next;
        }
        System.out.println();
    }

    public void bubbleSort() {
        if (conexao == null || conexao.next == null) {
            return;
        }else{
        boolean trocado;
        do {
             trocado = false;
              Noh atual = conexao;
              Noh previo = null;
            
              while (atual.next != null) {
                   if (atual.num > atual.next.num) {
                      Noh temp = atual.next;
                    
                      if (previo != null) {
                            previo.next = temp;
                      } else {
                           conexao = temp;
                       }
                    
                       atual.next = temp.next;
                       temp.next = atual;
                        trocado = true;
                 }
                
                  previo = atual;
                  atual = atual.next;
                }
            } while (trocado);
        }
    }

}

