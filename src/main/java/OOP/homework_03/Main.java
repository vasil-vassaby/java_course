package OOP.homework_03;

import OOP.homework_03.figure.Shape;
import OOP.homework_03.figure.circle.Circle;
import OOP.homework_03.figure.polygon.Regtangle;
import OOP.homework_03.figure.polygon.Square;
import OOP.homework_03.figure.polygon.Triangle;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

/*
Написать программу на языке Java, в которой идёт со следующими геометрическими фигурами:
1. Треугольник
2. Квадрат
3. Прямоугольник
4. Круг
В программе имеется массив фигур, с которым можно сделать следующие операции:
1. Добавить новую фигуру
2. Посчитать периметр у всех фигур
3. Посчитать площадь у всех фигур
Для фигуры использовать базовый абстрактный класс фигуры, у которого есть методы посчитать периметр и посчитать площадь фигуры.
Создать класс-коллекцию фигур В классе-коллекции реализовать методы:
1. Вывода информации о всех периметрах, площадях и длинах окружности всех фигур, где это возможно,
2. добавления новой фигуры,
3. удаления фигуры,
4. изменения фигуры по индексу,
5. сортировки по площади, вывод информации о всех фигурах.
При создании фигур необходимо осуществлять проверку входных данных на возможность создания данной фигуры и в случае ошибки выдавать соответствующие сообщения. Перодумать собственную иерархию исключений
 */
public class Main {
    public static void main(String[] args) throws Exception {
        CollectionFigure.addShape(new Triangle(7, 7, 7));
        CollectionFigure.addShape(new Regtangle(15, 7));
        CollectionFigure.addShape(new Square(5));
        CollectionFigure.addShape(new Circle(8));
        System.out.println("Вывод информации о фигурах в коллекции:");
        CollectionFigure.outputAllInfo();
        System.out.println("Удаление фигуры по индексу 0 в коллекции:");
        CollectionFigure.removeShape(0);
        System.out.println("Вывод информации о фигурах после удаления:");
        CollectionFigure.outputAllInfo();
        CollectionFigure.sortArea();
        System.out.println("Сортировка фигур коллекции по площади:");
        CollectionFigure.outputAllInfo();
        System.out.println("Изменение фигуры коллекции по индексу 2:");
        CollectionFigure.changeShape(2, new Triangle(2, 5, 6));
        System.out.println("Вывод информации о фигурах после изменения:");
        CollectionFigure.outputAllInfo();
    }

}
