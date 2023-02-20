package homework_03.task_03;

import homework_03.task_02.GetList;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
        ArrayList<Integer> intList = GetList.getList(); // для удобства класс взял из предыдущей задачи task_02
        int  minimalValue = MinValueList.minimalValue(intList);
        System.out.printf("Минимальное значение в списке = %d\n", minimalValue);
        int  maximalValue = MaxValueList.maxValue(intList);
        System.out.printf("Максимальное значение в списке = %d\n", maximalValue);
        double  averageValue = GetAverageList.getAverage(intList);
        System.out.printf("Cреднее арифметическое значение в списке = %.2f%n\n", averageValue);
    }
}
