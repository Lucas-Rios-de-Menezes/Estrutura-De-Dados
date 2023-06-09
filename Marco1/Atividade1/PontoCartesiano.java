package Marco1.Atividade1;
import java.lang.Math;

public class PontoCartesiano {
	public Double xb, xa, yb, ya;

	public PontoCartesiano(Double xb, Double xa, Double yb, Double ya) {
		this.xb = xb;
		this.xa = xa;
		this.yb = yb;
		this.ya = ya;
	}

	public Double getXb() {
		return xb;
	}

	public void setXb(Double xb) {
		this.xb = xb;
	}

	public Double getXa() {
		return xa;
	}

	public void setXa(Double xa) {
		this.xa = xa;
	}

	public Double getYb() {
		return yb;
	}

	public void setYb(Double yb) {
		this.yb = yb;
	}

	public Double getYa() {
		return ya;
	}

	public void setYa(Double ya) {
		this.ya = ya;
	}
	
	public void distanciaEuclidiana() {
		double pontox, pontoy, distancia;
		
		pontox = Math.pow(xb - xa, 2);
		pontoy = Math.pow(yb - ya, 2);
		distancia = Math.sqrt(pontox + pontoy);
		
		System.out.println("A distancia euclidiana entre os dois pontos e: ");
		System.out.printf("%.2f", distancia);
		
	}

}
