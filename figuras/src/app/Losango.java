package app;

public class Losango extends Poligono {

    @Override
    public double calcularPerimetro() {
        return 4 * getBase();
    }
}