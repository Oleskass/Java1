package java_seminars;

import java.time.LocalDateTime;
import java.util.Scanner;

public class seminar1_task1_1 {
    public static void main(String[] args) {
        /*
         * В консоли запросить имя пользователя. В зависимости от текущего времени,
         * вывести приветствие вида
         * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
         * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
         * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
         * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
         * 
         */
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date); // 2023-02-01T12:04:15.840558
        System.out.println(date.getHour()); // 2023-02-01T12:04:15.840558

        if (5 <= date.getHour() & date.getHour() < 12) {
            System.out.printf("Доброе утро, %s!\n", name);
        } else if (12 <= date.getHour() & date.getHour() < 18) {
            System.out.printf("Добрый день, %s!\n", name);
        } else if (18 <= date.getHour() & date.getHour() < 23) {
            System.out.printf("Добрый вечер, %s!\n", name);
        } else (23 <= date.getHour() & date.getHour() < 5) {
            System.out.printf("Доброй ночи, %s!\n", name);
        }
        iScanner.close();
    }

}
