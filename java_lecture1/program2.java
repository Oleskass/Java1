package java_lecture1;

// import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Hello, %s!\n", name);
        // System.out.printf("Your age: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int age = iScanner.nextInt();
        // System.out.printf("%d, it's not so much!)\n", age);

        // iScanner.close();

        String s = "qwe";
        int a = 123;
        String q = s + a;
        System.out.println(q);

        int b = 1, c = 2;
        int d = b + c;
        String res = String.format("%d + %d = %d \n", b, c, d);
        System.out.println(res);
        System.out.printf("%d + %d = %d \n", b, c, d);

        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00

        // Область видимости
        {
            int i = 123;
            System.out.println(i);
        }
        // System.out.println(i); // error: cannot find symbol
    }
}
