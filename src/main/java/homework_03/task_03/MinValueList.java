package homework_03.task_03;

import java.util.ArrayList;
import java.util.Collections;

public class MinValueList {
//    public static int minimalValue(ArrayList<Integer> list) {
//        return Collections.min(list);
//    }

    // 2 способ - с использованием foreach
    public static int minimalValue(ArrayList<Integer> list) {
        int min = list.get(0);
        for (Integer i : list) {
            if (i < min)
                min = i;
        }
        return min;
    }
}
