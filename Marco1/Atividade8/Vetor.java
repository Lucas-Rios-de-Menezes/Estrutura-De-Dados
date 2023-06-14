package Marco1.Atividade8;

public class Vetor {
	private int[] num = new int[1000];
	
	public void popularOrdem() {
        int numadd = 1;
        for(int i = 0; i < num.length; i++){
            num[i] = numadd;
            numadd++;
        }
	}

    public int binaryIt(int val){
        int start = 0;
        int end = num.length;
        int mid = 0;

        while(start <= end){
            mid = (start + end) / 2;
            if (num[mid] == val){
                return mid;
            }else if(num[mid] > val){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public int binaryRec(Vetor numfind, int i, int start, int end){
        if (start > end) {
            return -1; 
        }

        int mid = (start + end) / 2;

        if (num[mid] == i) {
            return mid;
        } else if (num[mid] > i) {
            return binaryRec(numfind, start, start, mid - 1); // Pesquisa na metade esquerda do array
        } else {
            return binaryRec(numfind, start, end + 1, end); // Pesquisa na metade direita do array
        }

    }



    public void print(){
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
