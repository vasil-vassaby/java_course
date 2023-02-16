package homework_01;// 4. Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
// могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
// восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет.
import java.util.ArrayList;
import java.util.List;

public class outwork_04 {
    public static void main(String[] args) {
        String str = " 2? + ?5 = 69"; // исходное выражение

        System.out.println("Исходное выражение: " + str);
        String[][] parsed_equation = parsing(str); // распарсенное выражение
        List<String> solutions = get_solutions(parsed_equation); // лист всех возможных решений выражения
        show_solutions(solutions); // вывод в консоль всех возможных решений выражения
    }

    static String[][] parsing(String data) {
        /**
         * Парсинг выражения.
         * @param data Строка с исходным выражением.
         * @return Массив с двумя распарсенными подмассивами: левая и правая часть выражения.
         */
        data = data.replaceAll(" ", "");
        String[] data_array = data.split("=");
        String[] right_array = new String[]{data_array[1]};
        String left = data_array[0];

        left = left.replaceAll("\\+", " + ");
        String[] left_array = left.split(" ");

        return new String[][]{left_array, right_array};
    }

    static List<Integer> get_all_numbers(String number) {
        /**
         * Создает List<Integer> из всех возможных вариантов числа, заменяя '?' на числа от 0 до 9.
         * Если в числе более одного '?', то благодаря рекурсии они так же будут заменены.
         *
         * @param number Строка числа с неизвестной одной или более цифрой разряда. Например, 2? может представлять из себя одно из значений:
         *               [20, 21, 22, ... 29]
         * @return Возвращает List<Integer> из всех возможных значений.
         */
        List<Integer> numbers = new ArrayList<>();
        if (!number.contains("?")) {
            numbers.add(Integer.parseInt(number));
            return numbers;
        }
        for (int i = 0; i <= 9; i++) {
            String replacedNumber = number.replaceFirst("\\?", String.valueOf(i));
            if (replacedNumber.contains("?")) {
                numbers.addAll(get_all_numbers(replacedNumber));
            } else {
                numbers.add(Integer.parseInt(replacedNumber));
            }
        }
        return numbers;
    }


    static List<String> get_solutions(String[][] parsed_equation) {
        /**
         * Составляет выражение и проверяет его тождественность.
         * @param parsed_equation Распарсенное исходное выражение
         * @return Лист из всех найденных решений в виде строк.
         */
        List<String> solutions = new ArrayList<>();
        int right_part = Integer.parseInt(parsed_equation[1][0]);
        String[] left_part = parsed_equation[0];

        List<Integer> first_member_all_numbers = get_all_numbers(left_part[0]);
        char operation = left_part[1].charAt(0);
        List<Integer> second_member_all_numbers = get_all_numbers(left_part[2]);

        for (int first_number : first_member_all_numbers) {
            for (int second_number : second_member_all_numbers) {
                if (calc(first_number, second_number, operation) == right_part) {
                    char this_operation = operation;
                    int this_second_member = second_number;
                    String solution = String.format("%d %c %d = %d", first_number, this_operation, this_second_member, right_part);
                    solutions.add(solution);
                }
            }
        }
        return solutions;
    }

    static double calc(int a, int b, char operation) {
        /**
         * Простой калькулятор на основе switch-case
         * @param a Первое число
         * @param b Второе число
         * @param operation Знак операции между числами a и b
         * @return Результат операции между числами a и b
         */
        switch (operation) {
            case '+':
                return a + b;
            default:
                System.out.println("Ошибка оператора.");
                return 0;
        }
    }

    static void show_solutions(List<String> solutions) {
        /**
         * Вывод в консоль всех возможных решений выражения, либо вывод того что решений нет
         * @param solutions Лист всех возможных решений
         */
        if (solutions.size() > 0) {
            System.out.println("Найдены решения:");
            for (int i = 0; i < solutions.size(); i++) {
                System.out.printf("\t%d) %s\n", i + 1, solutions.get(i));
            }
        } else {
            System.out.println("Решений нет.");
        }
    }
}
