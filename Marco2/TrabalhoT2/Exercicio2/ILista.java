package Marco2.TrabalhoT2.Exercicio2;

public interface ILista {
	public void insereInicio(Object info);
	public void insereFim(Object info);
	public boolean estahVazia();
	public boolean remove(Object info);
	public int tamanho();
	public void printList();
}
