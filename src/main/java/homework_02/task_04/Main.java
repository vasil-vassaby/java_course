// 4*. К калькулятору из предыдущего дз добавить логирование.

package homework_02.task_04;

import homework_02.task_02.BubbleSort;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;


public class Main {
    static Logger LOGGER = Logger.getLogger(BubbleSort.class.getName());
    static {
        try {
            FileHandler fh = new FileHandler("src/main/java/homework_02/task_04/log.txt", true);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            LOGGER.addHandler(fh);
        } catch (SecurityException e) {
            LOGGER.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за политики безопасности.",
                    e);
        } catch (
                IOException e) {
            LOGGER.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
                    e);
        }
    }
    public static void main(String[] args) {
        double result;
        char operation;
        LOGGER.info("Ввод чисел пользователем");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        LOGGER.info("Программа проверяет результат ввода числа");
        if (in.hasNextDouble()){
            double digit_first = in.nextDouble();
            double digit_second = in.nextDouble();
            LOGGER.info("Выбор операции пользователем");
            System.out.print("Введите операцию (+, -, *, /): ");
            operation = in.next().charAt(0);
            LOGGER.info("Программа выполняет операцию вычисления в зависимости от ввода пользователя");
            switch (operation) {
                case '+':
                    result = digit_first + digit_second;
                    break;
                case '-':
                    result = digit_first - digit_second;
                    break;
                case '*':
                    result = digit_first * digit_second;
                    break;
                case '/':
                    result = digit_first / digit_second;
                    break;
                default:
                    LOGGER.log(Level.WARNING,"Программа предупреждает пользователя об ошибке выбора операции");
                    System.out.print("Oшибка! Введите операцию из предложенных.");
                    return;
            }
            System.out.print("\nИтоговый результат: \n");
            LOGGER.info("Программа выводит результат");
            System.out.printf(digit_first + " " + operation + " " + digit_second + " = " + result + "\n");
        } else {
            LOGGER.log(Level.WARNING,"Программа предупреждает пользователя об ошибке ввода числа");
            System.out.println("Введите число!");
        }
    }
}
