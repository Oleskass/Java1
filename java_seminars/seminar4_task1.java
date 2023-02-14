package java_seminars;

import java.util.ArrayList;
import java.util.LinkedList;

public class seminar4_task1 {

    public static void main(String[] args) {
        /*
         * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
         * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
         * Сравните с предыдущим.
         */

        long start1 = System.currentTimeMillis();
        String s = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 1000000; i++) {
            list.add(1);
        }
        long finish1 = System.currentTimeMillis();
        long elapsed1 = finish1 - start1;
        System.out.println("ArrayList - Прошло времени в мс: " + elapsed1); // ок.25 мс

        long start2 = System.currentTimeMillis();
        String s2 = "";
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for (int i = 1; i < 1000000; i++) {
            list2.add(1);
        }
        long finish2 = System.currentTimeMillis();
        long elapsed2 = finish2 - start2;
        System.out.println("LinkedList - Прошло времени в мс: " + elapsed2); // ок.82 мс

    }
}
