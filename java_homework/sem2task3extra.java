package java_homework;

import java.util.logging.*;
import java.io.IOException;
import java.util.Scanner;

public class sem2task3extra {
    /*
     * Семинар 2. Задание 3*.
     * К калькулятору из предыдущего дз добавить логирование.
     */
    public static void main(String args[]) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(sem2task3extra.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("logCalc.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        try {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите число 1: ");
            int num_1 = iScanner.nextInt();
            System.out.println("Введите число 2: ");
            int num_2 = iScanner.nextInt();
            iScanner.nextLine();
            System.out.println("Введите операцию(+ - / *): ");
            String operation = iScanner.nextLine();
            iScanner.close();

            switch (operation) {
                case "+":
                    int res = calcAdd(num_1, num_2);
                    System.out.printf("%d %s %d = %d\n", num_1, operation, num_2, res);
                    logger.info(num_1 + " " + operation + " " + num_2 + " = " + res);
                    break;
                case "-":
                    res = calcSub(num_1, num_2);
                    System.out.printf("%d %s %d = %d\n", num_1, operation, num_2, res);
                    logger.info(num_1 + " " + operation + " " + num_2 + " = " + res);
                    break;
                case "/":
                    if (num_2 != 0) {
                        res = calcDiv(num_1, num_2);
                        System.out.printf("%d %s %d = %d\n", num_1, operation, num_2, res);
                        logger.info(num_1 + " " + operation + " " + num_2 + " = " + res);
                    } else {
                        System.out.println("На ноль делить нельзя");
                        logger.warning("Попытка деления на ноль");
                    }
                    break;
                case "*":
                    res = calcMult(num_1, num_2);
                    System.out.printf("%d %s %d = %d\n", num_1, operation, num_2, res);
                    logger.info(num_1 + " " + operation + " " + num_2 + " = " + res);
                    break;
                default:
                    System.out.println("Такой операции нет, попробуйте снова.");
                    logger.warning(
                            num_1 + " " + operation + " " + num_2 + " = " + "Такой операции нет, попробуйте снова.");
                    break;
            }
        } catch (Exception e) {
            System.err.println("Ошибка! Попробуйте ещё раз :)");
            logger.warning("Сработало исключение");
        }
    }

    static int calcAdd(int x, int y) {
        return x + y;
    }

    static int calcSub(int x, int y) {
        return x - y;
    }

    static int calcDiv(int x, int y) {
        return x / y;
    }

    static int calcMult(int x, int y) {
        return x * y;
    }
}
