package OOP.homework_03.figure.polygon;

public class Regtangle extends Polygon {
    public Regtangle(double a, double b) throws Exception {
        super(a, b);
        sides.add(a);
        sides.add(b);
    }

    @Override
    public double perimetr() {
        return 2 * (sides.get(0) + sides.get(1));
    }

    @Override
    protected double area() {
        return sides.get(0) * sides.get(1);
    }
}
