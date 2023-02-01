package java_seminars;

public class seminar1_task2 {
    public static void main(String[] args) {
        /*
         * Дан массив двоичных чисел, например [1,1,0,1,1,1],
         * вывести максимальное количество подряд идущих 1
         */
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int res = 0;
        System.out.println(arr.length); // 6
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count += 1;
                if (res < count)
                    res = count;
            } else {
                count = 0;
            }
        }
        System.out.printf("%d - максимальное количество 1 подряд\n", res);

    }

}
