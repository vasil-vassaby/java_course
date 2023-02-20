package homework_03.task_02;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        //2. Пусть дан произвольный список целых чисел, удалить из него четные числа
        ArrayList<Integer> list = GetList.getList();
        System.out.println("Дан список произвольных целых чисел: ");
        PrintList.printList(list);
        System.out.println();
        // (1 способ) Используя итератор удалим нечетные числа из списка
        //IteratorRemove.remove(list);
        // (2 способ) Используя встроенный метод у коллекций удалим нечетные числа из списка
        list.removeIf(n -> (n % 2 == 0));
        System.out.println("Получен список без четных чисел: ");
        PrintList.printList(list);
    }
}

