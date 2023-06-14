package Marco1.Atividade7;
import java.util.Random;

public class Vetor {
	private int[] num = new int[1000];
    private Random random = new Random();
	
	public void random() {
        for(int i = 0; i < num.length; i++){
            num[i] = random.nextInt(1000);
        }
	}

    public int maiorIt(){
        int maior = 0;
        for(int i = 0; i < num.length; i++){
            if(maior < num[i]){
                maior = num[i];
            }
        }
        return maior;
    }

    public int maiorRec(Vetor vet, int start, int end){
        int mid, first, second = 0;
        
        if(start == end){
            
            return num[start];

        }else{
            
            mid = (start + end) / 2;
            first = maiorRec(vet, start, mid);
            second = maiorRec(vet, mid+1, end);
            
            if (first > second){
            return first;
            }else{
                return second;
            }
        }
    }

    public void print(){
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
