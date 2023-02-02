package java_homework;

import java.util.Scanner;

public class task1 {
    /*
     * Задание 1.
     * Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
     */
    public static void main(String args[]) {
        try {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите положительное число n: ");
            String str_n = iScanner.nextLine();
            iScanner.close();
            int num_n = Integer.parseInt(str_n);

            if (num_n > 0) {
                int sum_n = 0;
                int mult_n = 1;
                for (int i = 1; i <= num_n; i++) {
                    sum_n += i;
                    mult_n *= i;
                }
                System.out.printf("Сумма чисел от 1 до %d = %d\n", num_n, sum_n);
                System.out.printf("Произведение чисел от 1 до %d или %d! = %d\n", num_n, num_n, mult_n);
            } else {
                System.out.println("Вы ввели отрицательное число, давайте снова");
            }

        } catch (Exception e) {
            System.err.println("Ошибка! Попробуйте ещё раз :)");
        }

    }
}
