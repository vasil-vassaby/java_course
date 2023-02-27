package homework_05.task_03;

public class HeapSort {
    // Реализация пирамидальной сортировки
     void sort(int arr[]) {
        // Построение кучи (перегруппируем массив)
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);
        // Один за другим извлекаем элементы из кучи
        for (int i = arr.length - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }
    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является индексом в arr[], n - размер кучи
    void heapify(int arr[], int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // левый = 2*i + 1
        int right = 2 * i + 2; // правый = 2*i + 2
        // Если левый дочерний элемент больше корня
        if (left < n && arr[left] > arr[largest])
            largest = left;
        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (right < n && arr[right] > arr[largest])
            largest = right;
        // Если самый большой элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }
    // Вспомогательная функция для вывода на экран массива размера n
    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

