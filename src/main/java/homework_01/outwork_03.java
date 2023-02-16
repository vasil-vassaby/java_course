package homework_01;// 3. Реализовать простой калькулятор

import java.util.Scanner;

public class outwork_03 {
    public static void main(String[] args) {
        double result;
        char operation;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        if (in.hasNextDouble()){
            double digit_first = in.nextDouble();
            double digit_second = in.nextDouble();
            System.out.print("Введите операцию (+, -, *, /): ");
            operation = in.next().charAt(0);
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
                    System.out.print("Oшибка! Введите операцию из предложенных.");
                    return;
            }
            System.out.print("\nИтоговый результат: \n");
            System.out.printf(digit_first + " " + operation + " " + digit_second + " = " + result);
        } else {
            System.out.println("Введите число!");
        }
    }
}
