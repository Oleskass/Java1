package java_homework;

import java.util.Scanner;

public class task3 {
    /*
     * Задание 3.
     * Реализовать простой калькулятор (операции + - / * )
     * 
     * Пример работы программы:
     * Введите число 1: 2
     * Введите число 2: 3
     * Введите операцию: +
     * Ответ: 5
     * 
     * Введите число 1: 2
     * Введите число 2: 3
     * Введите операцию: а
     * Ответ: Такой операции нет
     */
    public static void main(String args[]) {
        try {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите число 1: ");
            int num_1 = iScanner.nextInt();
            System.out.println("Введите число 2: ");
            int num_2 = iScanner.nextInt();
            iScanner.nextLine();
            System.out.println("Введите операцию(+ - / *): ");
            String operation = iScanner.nextLine();
            iScanner.close();

            switch (operation) {
                case "+":
                    int res = calcAdd(num_1, num_2);
                    System.out.printf("%d %s %d = %d\n", num_1, operation, num_2, res);
                    break;
                case "-":
                    res = calcSub(num_1, num_2);
                    System.out.printf("%d %s %d = %d\n", num_1, operation, num_2, res);
                    break;
                case "/":
                    if (num_2 != 0) {
                        res = calcDiv(num_1, num_2);
                        System.out.printf("%d %s %d = %.2f\n", num_1, operation, num_2, res);
                    } else {
                        System.out.println("На ноль делить нельзя");
                    }
                    break;
                case "*":
                    res = calcMult(num_1, num_2);
                    System.out.printf("%d %s %d = %d\n", num_1, operation, num_2, res);
                    break;
                default:
                    System.out.println("Такой операции нет, попробуйте снова.");
                    break;
            }
        } catch (Exception e) {
            System.err.println("Ошибка! Попробуйте ещё раз :)");
        }
    }

    static int calcAdd(int x, int y) {
        return x + y;
    }

    static int calcSub(int x, int y) {
        return x - y;
    }

    static int calcDiv(int x, int y) {
        return x / y;
    }

    static int calcMult(int x, int y) {
        return x * y;
    }
}
