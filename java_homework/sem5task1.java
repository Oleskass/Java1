package java_homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class sem5task1 {
    /*
     * Семинар 5. Задание 1.
     * Реализуйте структуру телефонной книги с помощью HashMap,
     * учитывая, что 1 человек может иметь несколько телефонов.
     */
    public static void main(String args[]) {
        try {
            HashMap<String, List<Integer>> phoneBook = new HashMap<>();
            phoneBook.put("Ivanov", Arrays.asList(8000456, 8111555));
            phoneBook.put("Petrov", Arrays.asList(8076446));
            phoneBook.put("Sidorov", Arrays.asList(8000987));
            phoneBook.put("Kotikov", Arrays.asList(8016621));
            phoneBook.put("Lozhkin", Arrays.asList(8088433));
            phoneBook.put("Sidorov", Arrays.asList(8000987, 8778980, 8540988));
            // System.out.println(phoneBook);

            for (String person : phoneBook.keySet()) {
                System.out.println(person + " has phone number(s): " + phoneBook.get(person));
            }

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }

}