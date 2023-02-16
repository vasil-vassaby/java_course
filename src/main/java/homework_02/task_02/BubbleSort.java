package homework_02.task_02;


import java.util.Arrays;
import java.util.logging.Level;
import static homework_02.task_02.Main.logger;

public class BubbleSort {
    public int[] sortedArray(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                logger.log(Level.INFO, Arrays.toString(arr));
            }

        }
        return arr;
    }

}
