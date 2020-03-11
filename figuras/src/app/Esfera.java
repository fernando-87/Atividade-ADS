package app;

public class Esfera implements Polígono3D {
    
    private double raio;

	@Override
	public double calcularVolume() {
		return 4 * Math.PI * Math.pow(raio, 3)/3;
	}
}
