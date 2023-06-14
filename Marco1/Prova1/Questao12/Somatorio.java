package Marco1.Prova1.Questao12;

public class Somatorio {

    public static int somatorio(int num){
        if (num == 1){
            return 1;
        }

        return num + somatorio(num-1);

    }
    
}
