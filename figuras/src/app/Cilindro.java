package app;

public class Cilindro implements Polígono3D {
	
	double raio = 0;

	@Override
	public double calcularVolume() {
		return Math.PI * Math.pow(raio, 2) * getAltura();
	}

	private double getAltura() {
		return 0;
	}
}
