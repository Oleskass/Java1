package java_homework;

import java.util.LinkedList;
import java.util.Random;

public class sem4task1 {
    /*
     * Семинар 4. Задание 1.
     * Создать LinkedList целых чисел (заполнить случайными числами).
     * Реализуйте метод, который вернет “перевернутый” список.
     */
    public static void main(String args[]) {
        try {
            LinkedList<Integer> numbers = new LinkedList<Integer>();
            Random rnd = new Random();
            for (int i = 0; i < 8; i++) {
                numbers.add(rnd.nextInt(999));
            }
            System.out.println("Случайный список:\n" + numbers);
            System.out.println("Перевёрнутый список:\n" + ListReverce(numbers));

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }

    public static LinkedList<Integer> ListReverce(LinkedList<Integer> listInput) {
        LinkedList<Integer> listNew = new LinkedList<Integer>();
        int numberOfIndexes = listInput.size() - 1;
        for (int i = 0; i < numberOfIndexes; i++) {
            listNew.add(listInput.get(numberOfIndexes - i));
            // System.out.println(listNew);
        }
        listNew.add(listInput.get(0));
        return (listNew);
    }

}