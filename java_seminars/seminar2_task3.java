package java_seminars;

import java.util.Scanner;

public class seminar2_task3 {
    public static void main(String[] args) {
        /*
         * Напишите метод, который принимает на вход строку (String) и определяет,
         * является ли строка палиндромом (возвращает boolean)
         */
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Type your word: ");
        String line = iScanner.nextLine();
        iScanner.close();
        // String line = "oasdsao";
        int n = line.length();
        boolean palin = false;
        for (int i = 0; i < n / 2; i++) {
            if (line.charAt(i) == line.charAt(n - 1 - i)) {
                palin = true;
            } else {
                palin = false;
                break;
            }
        }
        if (palin) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is NOT a palindrome");

        }
    }

}
