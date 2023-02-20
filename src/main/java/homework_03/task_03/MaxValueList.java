package homework_03.task_03;

import java.util.ArrayList;
import java.util.Collections;

public class MaxValueList {
//    public static int maxValue(ArrayList<Integer> list){
//        return Collections.max(list);
//    }

    // 2 способ - с использованием foreach
    public static int maxValue(ArrayList<Integer> list) {
        int max = list.get(0);

        for (Integer i : list) {
            if (i > max)
                max = i;
        }
        return max;
    }
}