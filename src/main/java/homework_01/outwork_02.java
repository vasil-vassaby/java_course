package homework_01;// Вывести все простые числа от 1 до 1000

public class outwork_02 {
    public static void main(String[] args) {
        System.out.println("Первый вариант: ");
        primeNumber();
        System.out.println();
        System.out.println("Второй вариант(оптимизированный): ");
        for (int i = 1; i < 1000; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    static void primeNumber(){
        for (int i = 2; i < 1000; i++) {  // Проходим циклом от 2 до 1000, т.к. 1 - это не простое число его не включаем изначально в цикл
            int count = 0; // заводим счетчик для определения кол-ва делителей
            for (int j = 1; j < i + 1; j++) { // проходим вложенным циклом и делим число для определения его делителей
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) { // если кол-во делителей 2, то выводим число в консоль
                System.out.print(i + " ");
            }
        }
    }

    // более эффективный метод
    static boolean isPrime(int number){
        if(number < 2) return false;
        if(number % 2 == 0) return number == 2; // сразу убираем из выборки все числа, которые делятся на 2 без остатка
        if(number % 3 == 0) return number == 3; // сразу убираем из выборки все числа, которые делятся на 3 без остатка

        for (int i = 5; i * i <= number; i += 6){ // числа от 1 до 4 убираем из выборки, и есть повторяемость через 6 элементов
            if (number % i == 0 || number % (i + 2) == 0) return false; // если условия выполняются, то это уже не простые числа
        }
        return true; // в противном случае возвращаем что это действительно простое число
    }
}


