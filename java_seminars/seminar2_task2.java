package java_seminars;

public class seminar2_task2 {
    public static void main(String[] args) {
        /*
         * Напишите метод, который сжимает строку.
         * Пример: вход: aaaabbbcdd, выход: a4b3cd2.
         */
        String line = "aaaabbbccddddw";
        // String[] letters = line.split("");
        int count = 1;
        StringBuilder sb = new StringBuilder();
        // for (String letter : letters) {
        // System.out.println(letter);
        // }
        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) == line.charAt(i - 1)) {
                count++;
            } else {
                sb.append(line.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(line.charAt(line.length() - 1));
        sb.append(count);
        System.out.println(sb);

    }

}
