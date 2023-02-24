// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
// Используйте итератор

package homework_04.task_03;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(36);
        linkedList.add(2);
        linkedList.add(18);
        linkedList.add(10);
        linkedList.add(50);
        System.out.println(linkedList);
        SumElemList sumElemList = new SumElemList();
        System.out.println(sumElemList.sum(linkedList));
    }
}
