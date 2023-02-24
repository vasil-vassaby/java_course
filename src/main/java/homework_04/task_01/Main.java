/*
        Пусть дан LinkedList с несколькими элементами.
        Реализуйте метод, который вернет “перевернутый” список.
        Постараться не обращаться к листу по индексам.
         */

package homework_04.task_01;


import static homework_04.task_01.LinkedList.head;

public class Main {
    public static void main(String[] args)
    {
        homework_04.task_01.LinkedList list = new LinkedList();

        // создаем двусвязный список через нашу вспомогательную функцию
        list.push(12);
        list.push(23);
        list.push(36);
        list.push(41);
        list.push(5);
        list.push(6);

        System.out.println("Первоначальный список ");
        list.printList(head);

        list.reverse();

        System.out.println();
        System.out.println("Перевернутый список ");
        list.printList(head);
    }
}

