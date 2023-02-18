package java_seminars.seminar6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Cat {
    int id;
    String name;
    int age;
    String color;
    String breed;
    int gender;
    boolean purring;

    public Cat(int id, String name, int age, String color,
            String breed, int gender, Boolean purring) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
        this.purring = purring;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, age: %d, color: %s", name, age, color);
    }

    public static List<Cat> findCatByGender(HashSet<Cat> hashCat, int gender) {
        List<Cat> catList = new ArrayList<Cat>();
        for (Cat elem : hashCat) {
            if (elem.gender == gender) {
                catList.add(elem);
            }
        }
        return catList;

    }
}
