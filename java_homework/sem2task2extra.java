package java_homework;

public class sem2task2extra {
    /*
     * Семинар 2. Задание 2*.
     * Дана json строка (можно сохранить в файл и читать из файла)
     * Написать метод(ы), который распарсит json и, используя StringBuilder, создаст
     * строки вида:
     * Студент [фамилия] получил [оценка] по предмету [предмет].
     * 
     * Входная строка:
     * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":
     * "Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка"
     * :"5","предмет":"Физика"}]
     * 
     * Выходная строка:
     * Студент Иванов получил 5 по предмету Математика.
     * Студент Петрова получил 4 по предмету Информатика.
     * Студент Краснов получил 5 по предмету Физика.
     */
    public static void main(String args[]) {
        try {
            String jLine = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}"
                    + ",{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\""
                    + ":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
            String jLineClear = jLine.replaceAll("[\"{}\\[\\]]", "");
            // System.out.println(jLineClear);
            StringBuilder sb = new StringBuilder();
            String line1 = "Студент ";
            String line2 = " получил ";
            String line3 = " по предмету ";
            String[] arr = jLineClear.split(",");
            for (String elem : arr) {
                String[] values = elem.split(":");
                // System.out.println(values[0]);
                // System.out.println(values[1]);
                if ("фамилия".equals(values[0])) {
                    sb.append(line1).append(values[1]);
                } else if ("оценка".equals(values[0]))
                    sb.append(line2).append(values[1]);
                else if ("предмет".equals(values[0])) {
                    sb.append(line3).append(values[1] + ".\n");
                }
            }

            System.out.println(sb);

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
