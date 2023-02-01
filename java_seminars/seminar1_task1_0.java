package java_seminars;

import java.util.Scanner;

public class seminar1_task1_0 {
    public static void main(String[] args) {
        /*
         * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
         * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
         */
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
    }

}
