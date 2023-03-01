package java_homework;

public class sem2task1 {
    /* изменение 1++++++++
     * Семинар 2. Задание 1.
     * Дана строка sql-запроса "select * from students where ".
     * Сформируйте часть WHERE этого запроса, используя StringBuilder.
     * Данные приведены ниже в виде json строки.
     * Если значение null, то параметр не должен попадать в запрос.
     * 
     * Входная строка:
     * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
     * 
     * Выходная строка:
     * select * from students where name = "Ivanov" and country = "Russia" and city
     * = "Moscow"
     */
    public static void main(String args[]) {
        try {
            String sqlQuery = "select * from students where ";
            String jLine = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
            StringBuilder sb = new StringBuilder();
            String jLineClear = jLine.replaceAll("[{}\" ]", "");
            // System.out.println(jLineClear);
            String[] arr = jLineClear.split(",");
            sb.append(sqlQuery);
            // System.out.println("1 " + sb);
            for (int i = 0; i < arr.length; i++) {
                String[] values = arr[i].split(":");
                // System.out.println(values[0]); // name, etc (keys)
                // System.out.println(values[1]); // Ivanov, etc (values)
                if (values[1].equals("null")) {

                } else {
                    if (i != 0) {
                        sb.append(" and ");
                    }
                    sb.append(values[0] + " = ");
                    sb.append("\"" + values[1] + "\"");

                }
            }

            System.out.println("Выходная строка sql-запроса:\n" + sb);

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
