package homework_04.task_03;

import java.util.LinkedList;

public class SumElemList {
    int sum(LinkedList<Integer> list) {
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return sum;
    }
}
