package app;

public class Cubo implements Pol�gono3D {
    
	@Override
	public double calcularVolume() {
		return getBase() * getAltura();
	}

	private int getAltura() {
		return 0;
	}

	private int getBase() {
		return 0;
	}
}
