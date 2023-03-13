package OOP.homework_03.figure.circle;

import OOP.homework_03.figure.Shape;

public class Circle extends Shape implements Circumference {
    private double ray;
    public Circle(double ray) throws Exception{
        this.ray = ray;
        if (ray <= 0) throw new Exception("Круг с радиусом ray <= 0 не может существовать!");
    }

    /**
     * @return значение площади круга
     */
    @Override
    protected double area() {
        return Math.round(Math.PI*ray*ray);
    }

    /**
     * @return значение длины окружности
     */
    @Override
    public double circumference() {
        return Math.round(2*Math.PI*ray);
    }

    @Override
    public String toString() {
        return super.toString() + " и длиной окружности - " + circumference();
    }
}
