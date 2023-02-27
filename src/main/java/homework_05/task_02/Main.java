/*
Пусть дан список сотрудников:

Написать программу,
которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
Для сортировки использовать TreeMap.
 */

package homework_05.task_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String text = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, " +
                "Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, " +
                "Петр Чернышов, Мария Федорова, Марина Светлова, " +
                "Мария Савина, Мария Рыкова, Марина Лугова, " +
                "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";

        ParseText parseList = new ParseText();
        List<String> list = parseList.parse(text);
        CreateMap createMap = new CreateMap();
        TreeMap<String, Integer> treeMap = createMap.create(list);

        System.out.println("Сортировка по ключу: ");
        System.out.println(treeMap);

        ValueComparator valueComparator = new ValueComparator(treeMap);
        TreeMap<String, Integer> sortedMap = new TreeMap<>(valueComparator);
        sortedMap.putAll(treeMap);

        System.out.println("Сортировка по значению: ");
        System.out.println(sortedMap);
    }
}
