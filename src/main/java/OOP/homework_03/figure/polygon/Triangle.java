package OOP.homework_03.figure.polygon;

public class Triangle extends Polygon {
    public Triangle(double a, double b, double c) throws Exception {
        super(a, b, c);
        if (!((a + b) > c && (b + c) > a && (c + a) > b))
            throw new Exception("Треугольник с такими сторонами не может существовать");
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    @Override
    public double perimetr() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    @Override
    protected double area() {
        double sP = perimetr()/2; // полу периметр
        return Math.round(Math.sqrt(sP*(sP - sides.get(0))*(sP - sides.get(1))*(sP - sides.get(2))));
    }
}
