package java_lecture2;

/**
 * Измерение времени кода и использование знаний API
 */
public class program {
    public static void main(String[] args) {
        // long start1 = System.currentTimeMillis();
        // String s = "";
        // for (int i = 0; i < 1_000_000; i++) {
        // s += "+";
        // }
        // long finish1 = System.currentTimeMillis();
        // long elapsed1 = finish1 - start1;
        // System.out.println("Прошло времени в мс: " + elapsed1);

        // // ≈41000 ms (у меня 105801)

        long start2 = System.currentTimeMillis();

        long timeNano = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }

        long finish2 = System.currentTimeMillis();
        long elapsed2 = finish2 - start2;
        System.out.println("Прошло времени в мс: " + elapsed2);

        timeNano = System.nanoTime() - timeNano;
        System.out.printf("Nano Прошло времени в мс: %d\n", timeNano / 1_000_000);
        System.out.println("Nano println Прошло времени в мс: " + timeNano / 1_000_000);

        // ≈9 ms (у меня 16)
    }

}
