package java_lecture1;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        System.out.println("bye world");
        String s = "   2";
        System.out.println(s);
        float f = 123.45f;
        double d = 678.45;
        System.out.println(f);
        System.out.println(d);
        char ch = '{';
        System.out.println(ch);
        boolean b = 100 <= 200;
        System.out.println(b);
        var k0 = 123;
        var k = '*';
        System.out.println(getType(k0));
        System.out.println(getType(k));
        int l = 22_450_870; // 22450870
        System.out.println(l);
        System.out.println(Integer.MAX_VALUE);
        String s1 = "qwerty";
        System.out.println(s1.charAt(1));
        int g = 205;
        System.out.println(g++); // выводит 205, тк вывод приоритетнее чем инкремент
        System.out.println(g); // а здесь уже инкремент увеличил g
        System.out.println(++g); // выводит 207, тк здесь инкремент приоритетнее чем вывод
        System.out.println(g); // g без изменений
        int t = 123;
        // t = t-- - --t; // 2
        // t = --t - --t; // 1
        // t = --t - t--; // 0
        t = t-- - t--; // 1
        System.out.println(t);
        int x = 5;
        int h = 2;
        System.out.println(x | h); // 101 и 010 = 111 это 7

        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        System.out.println(arr[3]); // 0
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr[3]); // 4
        arr[2] = 26;
        System.out.println(arr[2]); // 26

        int[] arr2[] = new int[3][5];
        for (int[] line : arr2) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr3 = new int[3][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%d ", arr3[i][j]);
            }
            System.out.println();
        }

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

}