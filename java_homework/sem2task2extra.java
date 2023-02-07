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
            String[] arr = jLineClear.split(",");
            for (int i = 0; i < arr.length; i++) {
                String[] values = arr[i].split(":");
                // for (int j = 0; j < values.length; j++) {
                // System.out.println("item - " + arr[i]);
                // System.out.println(values[0]);
                // System.out.println(values[1]);
                System.out.println("i = " + i);
                for (int j = i; j <= i; j++) {

                    switch (j) {
                        case 0:
                            sb.append("Студент " + values[1]);
                            System.out.println("i case0 = " + i);
                            break;
                        case 1:
                            sb.append(" получил " + values[1]);
                            System.out.println("i case1 = " + i);
                            break;
                        case 2:
                            sb.append(" по предмету " + values[1] + ".");
                            System.out.println("i case2 = " + i);
                            break;

                        default:
                            break;
                    }

                }

                // }
            }
            System.out.println("sb: " + sb);
            // for (String item : arr) {
            // String[] values = item.split(":");
            // System.out.println("item - " + item);
            // System.out.println(values[0]);
            // System.out.println(values[1]);
            // // sb.append("Студент" + values[1]);
            // }

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
