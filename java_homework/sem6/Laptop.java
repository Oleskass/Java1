package java_homework.sem6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Laptop {
    int id;
    String itemName;
    String brand, OS, processor;
    int ramSize, price, hdSize;
    boolean inStock;

    public Laptop(int id, String itemName, String brand, String OS, String processor,
            int ramSize, int price, int hdSize, boolean inStock) {
        this.id = id;
        this.itemName = itemName;
        this.brand = brand;
        this.OS = OS;
        this.processor = processor;
        this.ramSize = ramSize;
        this.price = price;
        this.hdSize = hdSize;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return String.format("Laptop: [%d] %s\nBrand: %s\nOperating system: %s\nProcessor: %s\n"
                + "RAM: %d GB\nHD Size: %d GB\nIn stock now: %s, Price: %d RUB", id,
                itemName, brand, OS, processor, ramSize, hdSize, inStock, price);
    }

    @Override
    public boolean equals(Object obj) {
        Laptop l = (Laptop) obj;
        return id == l.id && itemName == l.itemName && brand == l.brand
                && OS == l.OS && processor == l.processor && ramSize == l.ramSize
                && price == l.price && hdSize == l.hdSize && inStock == l.inStock;
    }

    // public String getBrand() {
    // return brand;
    // }

    // public String getOS() {
    // return OS;
    // }

    // public int getRAMSize() {
    // return ramSize;
    // }

    // public int getHDSize() {
    // return hdSize;
    // }

    // public boolean getInStock() {
    // return inStock;
    // }

    public static Map<Integer, String> filterLaptopBrand(HashSet<Laptop> hashLaptop) {
        Set<String> res = new HashSet<String>();
        for (Laptop elem : hashLaptop) {
            res.add(elem.brand);
        }
        int i = 0;
        Map<Integer, String> map1 = new HashMap<>();
        for (var elem : res) {
            i++;
            map1.put(i, elem);
        }
        return map1;
    }

    public static void filter2LaptopBrand(Map<Integer, String> map1, HashSet<Laptop> hashLaptop, int inputNumber) {
        for (Laptop elem : hashLaptop) {
            if (map1.get(inputNumber) == elem.brand) {
                System.out.println(elem.toString());
            }
        }
    }

}
