package java_seminars;

import java.util.Scanner;

public class seminar2_task3 {
    public static void main(String[] args) {
        /*
         * Напишите метод, который принимает на вход строку (String)
         * и определяет, является ли строка палиндромом (возвращает boolean)
         */
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Type your word: ");
        String line = iScanner.nextLine();
        iScanner.close();
        // String line = "oasdsao";
        int n = line.length();
        boolean palin = false;
        boolean palin2 = false;

        // ------------Первый вариант решения----------------------------------

        for (int i = 0; i < n / 2; i++) {
            if (line.charAt(i) == line.charAt(n - 1 - i)) {
                palin = true;
            } else {
                palin = false;
                break;
            }
        }

        // ------------Второй вариант решения----------------------------------

        String line2 = "";
        for (int i = 0; i < n; i++) {
            line2 += line.charAt(n - 1 - i);
        }
        if (line2.equalsIgnoreCase(line)) {
            palin2 = true;
        }

        if (palin & palin2) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is NOT a palindrome");

        }
    }

}
