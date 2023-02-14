package homework_01;// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)


import java.util.Scanner;

public class outwork_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (in.hasNextInt()){
            int n = in.nextInt();
            if (n >= 0){
                int tri = triangularNumber(n);
                int fac = factorial(n);
                System.out.printf("n-ое треугольное число = %d, факториал числа n = %d \n", tri, fac);
            } else {
                System.out.print("Вы ввели не натуральное число!");
            }

        } else {
            System.out.print("Вы ввели не целое число!");
        }
        in.close();
    }

    static int triangularNumber(int a){
        if (a == 0) return -1;
        int sum = 0;
        while (a != 0){
            sum += a;
            a--;
        }
        return sum;
    }

    static int factorial(int a){
        if (a == 0) return 1;

        int result = 1;

        for (int i = 1; i <= a; i++ ){
            result *= i;
        }
        return result;
    }
}
