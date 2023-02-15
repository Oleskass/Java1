package java_homework;

import java.util.ArrayList;
import java.util.Random;

public class sem3task1 {
    /*
     * Семинар 3. Задание 1.
     * Создать список целых чисел (заполнить случайными числами), удалить из списка
     * четные числа.
     */
    public static void main(String args[]) {
        try {
            ArrayList<Integer> numbers = new ArrayList<Integer>(20);
            Random random = new Random();
            for (int i = 0; i < 15; i++) {
                numbers.add(random.nextInt(50));
            }
            System.out.println("Массив из случайных чисел:\n" + numbers);
            int i = 0;
            while (i < numbers.size()) {
                if (numbers.get(i) % 2 == 0) {
                    // System.out.println("numbers.get(i)" + numbers.get(i));
                    numbers.remove(i);
                } else
                    i++;
            }
            System.out.println("Тот же массив без чётных чисел:\n" + numbers);

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
