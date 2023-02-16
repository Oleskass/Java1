package java_seminars;

import java.util.HashMap;

public class seminar5_task0 {
    /*
     * Создать стр-ру для хранения номеров паспортов и фамилий сотрудников
     * организации:
     * 123456 Иванов
     * 756475 Васильев
     * 637162 Петрова
     * 223133 Иванов
     * 989849 Петрова
     * 125651 Иванов
     * Вывести данные по сотрудникам с фамилией Иванов.
     */
    public static void main(String[] args) {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(123456, "Иванов");
        people.put(756475, "Васильев");
        people.put(637162, "Петрова");
        people.put(223133, "Иванов");
        people.put(989849, "Петрова");
        people.put(125651, "Иванов");
        // System.out.println(people);
        for (Integer userKey : people.keySet()) {
            if (people.get(userKey) == "Иванов") {
                System.out.println("Паспорт Иванова: " + userKey);
            }
        }

    }
}
