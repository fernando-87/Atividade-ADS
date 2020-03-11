package app;

public class Triangulo extends Poligono {

    @Override
    public double calcularArea() {
        return getBase() * getAltura() / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * getBase();
    }

}