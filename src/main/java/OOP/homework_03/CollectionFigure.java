package OOP.homework_03;

import OOP.homework_03.figure.Shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
Создать класс-коллекцию фигур. В классе-коллекции реализовать методы:
1. Вывода информации о всех периметрах, площадях и длинах окружности всех фигур, где это возможно,
2. добавления новой фигуры,
3. удаления фигуры,
4. изменения фигуры по индексу,
5. сортировки по площади, вывод информации о всех фигурах.
 */
public abstract class CollectionFigure /*implements Iterable<Shape>*/{
    private static final List<Shape> figures;
//    private static int currentPosition; для итератора

    static {
        figures = new ArrayList<>();
//        currentPosition = 0; для итератора
    }

    /**
     * вывод информации о фигурах - площадь и периметр(или длина окружности)
     */
    protected static void outputAllInfo(){
        if (!figures.isEmpty()) {
            //System.out.println("Фигуры коллекции: ");
            for (Shape shape : figures) {
                System.out.println(shape);
            }
        } else System.out.println("Коллекция фигур пуста!");
    }

    /**
     * добавление фигуры в коллекцию
     * @param shape тип фигуры
     */
    protected static void addShape(Shape shape){
        figures.add(shape);
        //System.out.println("Фигура " + shape + " добавлена в коллекцию!");
    }

    /**
     * удаление фигуры из коллекции
     * @param index индекс фигуры в коллекции
     */
    protected static void removeShape(int index){
        try {
            Shape shape = figures.remove(index);
            //System.out.println("Фигура " + shape + " удалена из коллекции!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы коллекции фигур!");
        }
    }

    /**
     * изменение фигуры в коллекции
     * @param index индекс изменяемой фигуры
     * @param shape новая фигура по указанному индексу
     */
    protected static void changeShape(int index, Shape shape){
        try {
            figures.set(index, shape);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы коллекции фигур!");
        }
    }

    /**
     * сортировка фигур коллекции по площади
     */
    protected static void sortArea(){
        Collections.sort(figures);
    }

//            делал итератор своего объекта (для практики)
//    public static boolean hasNext() {
//        return currentPosition < figures.size();
//    }
//    public static Shape next() {
//        Shape shape = figures.get(currentPosition);
//        currentPosition++;
//        return shape;
//    }
}
