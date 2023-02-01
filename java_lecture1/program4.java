package java_lecture1;

public class program4 {
    public static void main(String[] args) {
        int a = 222;

        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("a");
                break;
            case 5:
                System.out.println("b");
                break;
            default:
                System.out.println("idk");
                break;
        }

        int value = 321;
        int count = 0;
        // while (value != 0) {
        // value /= 10;
        // count++;
        // }
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count); // 3

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }

        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // int arr[] = new int[10];
        int arr[] = new int[] { 1, 2, 3, 4, 55, 33, 70 };
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }

}
