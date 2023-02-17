package java_lecture6;

import java.util.*;

public class program {
    /**
     * 
     */
    public static void main(String[] args) {
        try {
            // // HashSet
            // Set<Integer> set1 = new HashSet<>();
            // set1.add(1);
            // set1.add(12);
            // set1.add(123);
            // set1.add(1234);
            // set1.add(1234);
            // System.out.println(set1);
            // System.out.println(set1.contains(12)); // true
            // set1.add(null);
            // System.out.println(set1.size()); // 5
            // System.out.println(set1); // [null, 1, 1234, 123, 12]
            // set1.remove(12);
            // for (var item : set1) {
            // System.out.println(item); // null 1 1234 123
            // }
            // set1.clear();
            // System.out.println(set1); // []

            // =================

            // // MathSet
            // var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
            // var b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
            // var u = new HashSet<Integer>(a);
            // u.addAll(b);
            // var r = new HashSet<Integer>(a);
            // r.retainAll(b);
            // var s = new HashSet<Integer>(a);
            // s.removeAll(b);

            // System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
            // System.out.println(b); // [17, 2, 3, 5, 7, 11, 13]
            // System.out.println("addAll:");
            // System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11, 13]
            // System.out.println("retainAll:");
            // System.out.println(r); // [2, 3, 5, 7]
            // System.out.println("removeAll (a-b):");
            // System.out.println(s); // [1, 4, 6]

            // =================

            // // TreeSet
            // var a = new TreeSet<>(Arrays.asList(1, 7, 2, 3, 6, 4, 5));
            // var b = new TreeSet<>(Arrays.asList(13, 3, 17, 7, 2, 11, 5));

            // System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
            // System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
            // System.out.println(a.headSet(4)); // [1, 2, 3]
            // System.out.println(a.tailSet(4)); // [4, 5, 6, 7]
            // System.out.println(a.subSet(3, 5)); // [3, 4]

            // =================

            // LinkedHashSet
            var a = new LinkedHashSet<>(Arrays.asList(1, 7, 2, 3, 6, 4, 5));
            var b = new LinkedHashSet<>(Arrays.asList(13, 3, 17, 7, 2, 11, 5));
            a.add(28);
            System.out.println(a); // [1, 7, 2, 3, 6, 4, 5, 28]
            System.out.println(b); // [13, 3, 17, 7, 2, 11, 5]
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
