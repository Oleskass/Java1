package java_lecture2;

/**
 * Работа со строками
 */
public class program2 {
    public static void main(String[] args) {
        String[] name = { "О", "л", "е", "с", "я" };
        String sk = "ОЛЕСЯ С.";
        System.out.println(sk.toLowerCase()); // олеся с.
        System.out.println(String.join("", name)); // Олеся
        System.out.println(String.join("", "О", "л", "е", "с", "я"));
        // Олеся
        System.out.println(String.join(",", "О", "л", "е", "с", "я"));
        // О,л,е,с,я
    }

}
