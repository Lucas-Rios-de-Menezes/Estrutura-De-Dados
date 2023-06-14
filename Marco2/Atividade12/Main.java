package Marco2.Atividade12;

public class Main {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Joao Cabreiro", 21, 2.3);
        Aluno aluno2 = new Aluno("Jose da Silva", 20, 6.8);
        Aluno aluno3 = new Aluno("Luan Romeu Lopes", 19, 8.9);

        FilaLista lista = new FilaLista();

        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);

        lista.print();

        System.out.println("/////////////////////////////////////////////////");
        System.out.println("");

        lista.remove();

        lista.print();

        System.out.println("/////////////////////////////////////////////////");
        System.out.println("");

        Aluno aluno4 = new Aluno("Lorencio Josefino", 25, 10);
        lista.add(aluno4);

        lista.print();

    }
    
}
