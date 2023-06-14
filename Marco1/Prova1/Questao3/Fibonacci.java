package Marco1.Prova1.Questao3;

public class Fibonacci{

    public long calculo(int n) {
        long F = 0;
        long ant = 0;

        for (int i = 1; i <= n; i++){
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
        }
        return F;
    }

}