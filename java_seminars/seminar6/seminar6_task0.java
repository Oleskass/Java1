package java_seminars.seminar6;

import java.util.HashSet;
import java.util.Scanner;

public class seminar6_task0 {
    /*
     * 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания,
     * можно использовать не все придуманные поля и методы.
     * Создайте несколько экземпляров этого класса, выведите их в консоль.
     * 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat,
     * выводилась его кличка, цвет и возраст (или другие параметры
     * на ваше усмотрение).
     */
    public static void main(String[] args) {
        // создание экземпляра класса без "конструктора" в классе Cat:
        // Cat cat1 = new Cat();
        // cat1.name = "Barsik";
        // cat1.age = 5;
        // cat1.color = "Black";
        // cat1.breed = "Siberian";
        // cat1.gender = "m";
        // cat1.purring = true;

        System.out.println("Welcome to the Cat-system!\n_____________________________");
        System.out.println("Menu:\nPress 1 to show all cat breeds\n"
                + "Press 2 to search");

        Scanner iScanner = new Scanner(System.in);
        int inputNum = iScanner.nextInt();

        HashSet<Cat> catSet = new HashSet<Cat>();

        Cat cat1 = new Cat(259, "Barsik", 5, "Black",
                "Siberian", 1, true);
        Cat cat2 = new Cat(260, "Musya", 4, "White",
                "Russian", 0, true);
        Cat cat3 = new Cat(261, "Kot", 3, "Brown",
                "British", 1, false);
        // System.out.println(cat1.toString());
        // System.out.println(cat2.toString());
        // System.out.println(cat3.toString());

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);

        // System.out.println(catSet);
        // поиск по параметру (gender в данном случае)
        // System.out.println(Cat.findCatByGender(catSet, 0));
        // System.out.println(Cat.findCatByGender(catSet, 1));

        switch (inputNum) {
            case 1:
                System.out.println("All cat breeds:");
                for (Cat elem : catSet) {
                    System.out.println(elem.breed);
                }
                break;
            case 2:
                System.out.println("Enter cat's gender (female - 0/male - 1):");
                int inputGender = iScanner.nextInt();
                System.out.println(Cat.findCatByGender(catSet, inputGender));
                break;
            default:
                System.out.println("Something's wrong");
                break;
        }

        iScanner.close();
    }

}
