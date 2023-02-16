package java_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class sem5task2 {
    /*
     * Семинар 5. Задание 2.
     * Пусть дан список сотрудников:
     * Светлана Петрова
     * Кристина Белова
     * Анна Мусина
     * Анна Крутова
     * Иван Юрин
     * Петр Лыков
     * Павел Чернов
     * Петр Чернышов
     * Мария Федорова
     * Марина Светлова
     * Иван Савин
     * Мария Рыкова
     * Марина Лугова
     * Анна Владимирова
     * Иван Мечников
     * Петр Петин
     * Иван Ежов
     * 
     * Написать программу, которая найдет и выведет повторяющиеся имена с
     * количеством повторений.
     * Отсортировать по убыванию популярности.
     * 
     * Иван 4, ...
     */
    public static void main(String args[]) {
        try {
            HashMap<String, Integer> persons = new HashMap<>();

            String collegues = "Иван Иванов, Светлана Петрова, Кристина Белова, "
                    + "Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, "
                    + "Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, "
                    + "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, "
                    + "Петр Петин, Иван Ежов";
            String[] collegArr = collegues.split(", ");
            for (String person : collegArr) {
                String[] name = person.split(" ");
                // System.out.println(person);
                if (persons.containsKey(name[0])) {
                    persons.put(name[0], persons.get(name[0]) + 1);
                } else {
                    persons.put(name[0], 1);
                }
                // System.out.println(name[0]);
                // System.out.println(name[1]);
            }
            // System.out.println(persons);

            List<Integer> positions = new ArrayList<Integer>(persons.values());
            positions.sort(Collections.reverseOrder());
            // System.out.println(positions);

            HashMap<String, Integer> sortedNames = new LinkedHashMap<>();
            for (int position : positions) {
                for (String name : persons.keySet()) {
                    if (position == persons.get(name)) {
                        sortedNames.put(name, position);
                    }
                }
            }
            for (String elem : sortedNames.keySet()) {
                System.out.println("Имя \"" + elem + "\" повторилось: " + sortedNames.get(elem) + " раз(а)");
            }

            // System.out.println(sortedNames);

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}