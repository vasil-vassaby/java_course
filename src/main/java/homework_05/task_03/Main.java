/*
 *Реализовать алгоритм пирамидальной сортировки (HeapSort)
 */


package homework_05.task_03;

public class Main {
    public static void main(String[] args) {

        int[] arr = {11, -1, 0, 2, 12, 3};

        HeapSort heapSort = new HeapSort();

        System.out.println("Первоначальный массив: ");
        heapSort.printArray(arr);

        heapSort.sort(arr);

        System.out.println("Отсортированный массив: ");
        heapSort.printArray(arr);
    }

}

