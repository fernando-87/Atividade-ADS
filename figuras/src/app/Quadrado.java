package app;

public class Quadrado extends Poligono
         implements Diagonal {

    @Override
    public double calcularPerimetro() {
        return 4 * getBase();
    }

    @Override
    public double calcularDiagonal() {
        return getBase() * Math.sqrt(2);
    }

}