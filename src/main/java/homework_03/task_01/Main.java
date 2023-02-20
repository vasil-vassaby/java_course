package homework_03.task_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //   1. Реализовать алгоритм сортировки слиянием
    public static void main(String[] args) {
        int[][] sortMatrix = {{-1, 5, -2}, {1, 2, 4}, {6, 3, 0}};
        System.out.println("Дан двумерный массив: ");
        System.out.println(Arrays.deepToString(sortMatrix));
        System.out.println("Переводим двумерный массив в одномерный: ");
        int[] sortArray = MatrixToArray.matrixToArray(sortMatrix);
        System.out.println(Arrays.toString(sortArray));
        int[] resultArray = MergeSort.mergeSort(sortArray);
        System.out.println("Сортируем одномерный массив методом слияния: ");
        System.out.println(Arrays.toString(resultArray));
        System.out.println("Переводим одномерный массив в двумерный: ");
        int[][] resultMatrix = ArrayToMatrix.arrayToMatrix(resultArray);
        System.out.println(Arrays.deepToString(resultMatrix));
    }
}

