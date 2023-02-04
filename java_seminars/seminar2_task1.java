package java_seminars;

import javax.sound.midi.Synthesizer;

public class seminar2_task1 {
    public static void main(String[] args) {
        /*
         * Дано чётное число N (>0) и символы c1 и c2.
         * Написать метод, который вернёт строку длины N, которая состоит из
         * чередующихся символов c1 и c2, начиная с c1.
         */
        int n = 20;
        char c1 = 'u';
        char c2 = '*';
        String s1 = "s";
        String s2 = "-";
        String line = "";
        String line2 = "";

        for (int i = 0; i < n / 2; i++) {
            line += c1;
            line += c2;
            line2 += s1 + s2;
        }
        System.out.println(line);
        System.out.println(line2);

        StringBuilder sb_line = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb_line.append(c1);
            sb_line.append(c2);
        }
        System.out.println(sb_line);

    }

}
