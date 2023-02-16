// 2. Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

package homework_02.task_02;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());
    static {
        try {
            FileHandler fh = new FileHandler("src/main/java/homework_02/task_02/log.txt");
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.addHandler(fh);
        } catch (SecurityException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за политики безопасности.",
                    e);
        } catch (IOException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
                    e);
        }
    }
    public static void main(String[] args) {
        int[] array = new int[] {4, -2, -4, 1, 3, 2, -3, -1, 0};
        logger.info("Первоначальный массив чисел: " + Arrays.toString(array));
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortArray = bubbleSort.sortedArray(array);
        logger.info("Отсортированный массив чисел: " + Arrays.toString(sortArray));
    }
}
