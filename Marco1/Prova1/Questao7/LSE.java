package Marco1.Prova1.Questao7;

public class LSE{
    Noh conexao;

    public LSE(){
        this.conexao = null;
    }

    public void insere(int o) {
		Noh novo = new Noh(o);
		if (conexao == null) {
			conexao = novo;
		}else {
			novo.setProximo(conexao);
			conexao = novo;
		}
	}

    public void imprimeRec() {
        printListRecursive(conexao);
    }

    private void printListRecursive(Noh noh) {
        if (noh == null) {
            return;
        }

        System.out.print(noh.num + " ");
        printListRecursive(noh.next);
    }
}
