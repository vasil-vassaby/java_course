package homework_06;

import java.util.*;
/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев -
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */
public class Main {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop(1, "black", "Windows", 4, 128);
        Laptop lp2 = new Laptop(2, "silver", "Mac", 8, 256);
        Laptop lp3 = new Laptop(3, "white", "Linux", 8, 512);
        Laptop lp4 = new Laptop(4, "blue", "Windows", 12, 128);
        Laptop lp5 = new Laptop(5, "gold", "Linux", 16, 512);
        Laptop lp6 = new Laptop(6, "black", "Linux", 16, 512);

        Set<Laptop> setLaptop = new HashSet<>();
        setLaptop.add(lp1);
        setLaptop.add(lp2);
        setLaptop.add(lp3);
        setLaptop.add(lp4);
        setLaptop.add(lp5);
        setLaptop.add(lp6);

        OutputLaptop.printList(setLaptop);

        CreateFilter.filter(setLaptop);
    }
}