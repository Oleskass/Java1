package java_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class sem3task2 {
    /*
     * Семинар 3. Задание 2.
     * Создать список целых чисел (заполнить случайными числами).
     * Найти минимальное, максимальное и среднее из этого списка.
     */
    public static void main(String args[]) {
        try {
            ArrayList<Integer> numbers = new ArrayList<Integer>(10);
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                numbers.add(random.nextInt(100));
            }
            System.out.println("Сгенерированный список:\n" + numbers);
            int maxN = Collections.max(numbers);
            int minN = Collections.min(numbers);
            int averNum = 0;
            int sum = 0;
            for (Integer elem : numbers) {
                sum += elem;
            }
            averNum = sum / numbers.size();

            System.out.printf("Максимальное число из списка: %d\n"
                    + "Минимальное число из списка: %d\n"
                    + "Среднее значение чисел списка: %d\n", maxN, minN, averNum);

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
