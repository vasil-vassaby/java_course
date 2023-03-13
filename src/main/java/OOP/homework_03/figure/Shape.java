package OOP.homework_03.figure;

/**
 * абстрактный класс - Фигура
 */
public abstract class Shape implements Comparable<Shape>{
    /**
     * @return площадь фигуры
     */
    protected abstract double area();

    /**
     * @param o объект для сравнения
     * @return фигуры, отсортированные по площади
     */
    @Override
    public int compareTo(Shape o) {
        return Double.compare(area(), o.area()); // сравниваем площади фигур
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " площадью - " + area();
    }
}
