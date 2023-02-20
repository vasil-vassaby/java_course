package homework_03.task_01;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = MergeSortInner.mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }
}
