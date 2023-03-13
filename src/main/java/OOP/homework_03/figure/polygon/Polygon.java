package OOP.homework_03.figure.polygon;

import OOP.homework_03.figure.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * абстрактный класс Многоугольник,
 * содержит лист для включения сторон
 */
public abstract class Polygon extends Shape implements Perimetr {
    protected List<Double> sides = new ArrayList<>();
    protected Polygon(double... sides) throws Exception {
        for (double side: sides) {
            if (side <= 0) throw new Exception("Многоугольник с такими сторонами не может существовать!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " и периметром - " + perimetr();
    }
}
