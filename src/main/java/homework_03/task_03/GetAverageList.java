package homework_03.task_03;

import java.util.ArrayList;

public class GetAverageList {
    // 1 способ - с использованием stream.average
//    public static double getAverage(ArrayList<Integer> list) {
//        return list.stream()
//                .mapToInt(a -> a)
//                .average().orElse(0);
//    }
    // 2 способ - с использованием foreach
    public static double getAverage(ArrayList<Integer> list) {
        long sum = 0;
        for (int i: list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }
}
