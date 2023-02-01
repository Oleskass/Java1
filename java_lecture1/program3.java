package java_lecture1;

public class program3 {
    public static void main(String[] args) {
        sayHi();
        lib.sayBye();

        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0

        int a = 1, b = 2, c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);

    }

    static void sayHi() {
        System.out.println("hi");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

}
