package OOP.homework_04;
/*
Реализовать класс для работы с одномерными динамическими массивами произвольных данных(произвольного типа).
Класс будет иметь следующие конструкторы:
1. Конструктор без параметров – конструктор по умолчанию, проводящий базовую инициализацию массива
2. Конструктор с параметром T[] – конструктор, который проводит инициализацию и заполняет массив данными, пришедшими из параметра
Так же класс будет иметь следующие публичные методы:
1. Вставка в массив
2. Удаление элемента по индексу
3. Удаление всех элементов с заданным значением
4. Поиск минимума
5. Поиск максимума
6. Поиск суммы элементов массива
7. Поиск произведения элементов массива
8. Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
9. Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.
10. Пузырьковая сортировка
11. Сортировка простыми вставками
12. Сортировка простым выбором
13. Получение элемента массива по индексу
14. Задание значения элементу массива с заданным индексом
15. Печать массива на экран
16. Длинна массива
Так же класс должен содержать следующие приватные поля:
1. Сам массив произвольных данных.
2. Длину массива
*Так же массив должен содержать следующие перегруженные операторы:
1. Оператор, получающий элемент по заданному индексу
2. Оператор, позволяющий установить значение элемента по заданному индексу
*Так же в случае, если могут произойти ошибки или некорректная работа в конструкторах или методах, необходимо использовать механизм исключений для обработки возможных ошибок.
 */


import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T extends Comparable<T>> implements Implementable<T>, Countable<T>, Sortable<T> {
    private T[] array; // массив произвольного типа
    private int len; // длина массива

    /**
     * Конструктор по умолчанию
     * инициализирует массив
     */
    public MyArrayList() {
        this.len = 0; // задаем длину по умолчанию 0
        this.array = (T[]) new Comparable[len];
    }

    /**
     * Конструктор с одним параметром
     * @param array массив произвольного типа
     */
    public MyArrayList(T[] array) {
        this.array = array;
        this.len = array.length; // длина по умолчанию соответствует длине массива из параметра
    }

    @Override
    public void add(T e) {
        this.array = Arrays.copyOf(this.array, this.array.length + 1);
        array[len++] = e;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= len) {
            throw new RuntimeException("Индекс " + index + " выходит за рамки!");
        } else {
            System.arraycopy(array, index + 1, array, index, len - index - 1);
            array[--len] = null;
        }
    }
    /**
     * Метод для удаления всех элементов по указанному значению.
     * @param e удаляемый элемент.
     */
    @Override
    public void removeIf(T e) {
        int curIndex = 0;
        for (int i = 0; i < len; i++) {
            if (!array[i].equals(e)) {
                array[curIndex++] = array[i];
            }
        }
        for (int i = curIndex; i < len; i++) {
            array[i] = null;
        }

        len = curIndex;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= len) {
            throw new IndexOutOfBoundsException("Индекс " + index + " выходит за рамки!");
        }
        return array[index];
    }

    @Override
    public int size() { return len; }

    @Override
    public T set(int index, T e) {
        if (index < 0 || index >= len) {
            throw new IndexOutOfBoundsException("Индекс " + index + " выходит за рамки!");
        }
        return array[index] = e;
    }

    /**
     * Метод возвращает индекс первого вхождения искомого элемента.
     * @param e искомый элемент.
     * @return индекс искомого элемента.
     */
    @Override
    public int indexOf(T e) {
        for (int i = 0; i < len; i++) {
            if (array[i].equals(e)) return i;
        }
        return -1;
    }
    /**
     * Метод проверки наличия элемента в массиве.
     *
     * @param e искомый элемент.
     * @return true, если элемент в массиве есть, false – нет.
     */
    @Override
    public boolean contains(T e) {
        return indexOf(e) != -1;
    }

    /**
     * Метод вывода информации по содержимому массива
     */
    @Override
    public void printInfo() {
        for (T items : array) {
            System.out.println(items);
        }
    }
    /**
     * Метод пузырьковой сортировки.
     */
    @Override
    public void bubbleSort() {
        if (len == 0) {
            throw new RuntimeException("Нельзя отсортировать пустой массив!");
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Метод сортировки простыми вставками.
     */
    @Override
    public void insertionSort() {
        if (len == 0) {
            throw new RuntimeException("Нельзя отсортировать пустой массив!");
        }
        for (int i = 1; i < len; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    /**
     * Метод сортировки простым выбором.
     */
    @Override
    public void selectionSort() {
        if (len == 0) {
            throw new RuntimeException("Нельзя отсортировать пустой массив!");
        }
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    @Override
    public void min() {
        if (len == 0) {
            throw new RuntimeException("Нельзя найти минимальный элемент в массиве!");
        }
        T min = array[0];
        for (int i = 1; i < len; i++) {
                if (array[i].compareTo(min) < 0) min = array[i];
        }
        System.out.println(min);
    }

    @Override
    public void max() {
        if (len == 0) {
            throw new RuntimeException("Нельзя найти минимальный элемент в массиве!");
        }
        T max = array[0];
        for (int i = 1; i < len; i++) {
            if (array[i].compareTo(max) > 0) max = array[i];
        }
        System.out.println(max);
    }


    @Override
    public void sum() {
        if (len == 0) {
            throw new RuntimeException("Нельзя найти сумму элементов в пустом массиве!");
        }

        double sum = 0;
        try {
            for (int i = 0; i < len; i++) {
                sum += ((Number) array[i]).doubleValue();
            }
            System.out.println(sum);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void multiply() {
        if (len == 0) {
            throw new RuntimeException("Нельзя найти произведение элементов в пустом DynamicArray!");
        }
        try {
            double product = 1;
            for (int i = 0; i < len; i++) {
                product *= ((Number) array[i]).doubleValue();
            }
            System.out.println(product);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }
}
