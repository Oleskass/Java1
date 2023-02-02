package java_homework;

public class task2 {
    /*
     * Задание 2.
     * Вывести все простые числа от 1 до 1000
     */
    public static void main(String args[]) {
        // String simple_num = "1";
        boolean res = true;
        for (int i = 1; i < 1001; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    res = false;
                    break;
                }
            }
            if (res)
                System.out.print(i + " ");
            else
                res = true;
        }
    }
}
