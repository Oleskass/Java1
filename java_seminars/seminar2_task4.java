package java_seminars;

import java.io.FileWriter;
import java.io.IOException;

public class seminar2_task4 {
    public static void main(String[] args) {
        /*
         * Напишите метод, который составит строку, состоящую из
         * 100 повторений слова TEST и метод, который запишет эту
         * строку в простой текстовый файл, обработайте исключения
         */

        String text = "TEST";
        String newText = "";

        // без StringBuilder
        for (int i = 0; i < 100; i++) {
            newText = newText.concat(text);
        }

        // с StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(text);
        }

        try {
            FileWriter f1 = new FileWriter("fileTEST.txt", true);
            f1.write(sb + "\n");
            f1.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
