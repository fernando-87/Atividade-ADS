package app;

public class Piramide implements Polígono3D {
	
	@Override
	public double calcularVolume() {
		return 1/3 * getBase() * getAltura();
	}

	private int getBase() {
		return 0;
	}

	private int getAltura() {
		return 0;
	}
}
