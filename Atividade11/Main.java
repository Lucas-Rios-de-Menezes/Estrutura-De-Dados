package Atividade11;

public class Main {
    public static void main(String[] args) {

        FilaVet fila = new FilaVet(10);
        fila.add(20);
        fila.add(10);
        fila.add(40);
        fila.add(35);

        fila.print();

        fila.remove();
        fila.remove();

        fila.print();

    }
    
}
