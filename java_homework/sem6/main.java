package java_homework.sem6;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class main {

        public static void Main(String args[]) {
                Laptop laptop1 = new Laptop(17861, "Lenovo 2022 IdeaPad 3", "Lenovo",
                                "Windows 11", "Intel Core i3", 8, 28890,
                                256, true);
                Laptop laptop2 = new Laptop(19003, "Lenovo 2022 IdeaPad 3i", "Lenovo",
                                "Windows 11 Pro", "Intel Core i5", 8, 45190,
                                512, true);
                Laptop laptop3 = new Laptop(18444, "MacBook Air 13 2022 M2", "Apple",
                                "MacOS 10 12 Sierra", "Apple M2", 8, 125880,
                                512, true);
                Laptop laptop4 = new Laptop(18125, "MacBook Air 13 Late 2020 M1", "Apple",
                                "MacOS", "Apple M1", 16, 219990,
                                512, false);
                Laptop laptop5 = new Laptop(16557, "Acer Aspire 5", "Acer",
                                "Windows 11", "AMD Ryzen 5", 8, 36470,
                                256, true);

                HashSet<Laptop> laptopSet = new HashSet<Laptop>();

                laptopSet.add(laptop1);
                laptopSet.add(laptop2);
                laptopSet.add(laptop3);
                laptopSet.add(laptop4);
                laptopSet.add(laptop5);

                System.out.println("------------------------------\n"
                                + "Welcome to the Laptop catalog!\n"
                                + "------------------------------\n"
                                + "Press 1 to print all items\n"
                                + "Press 2 to search in catalog\n"
                                + "Press 0 to exit");
                int inputNum = askInt();

                switch (inputNum) {
                        case 0:
                                System.out.println("Goodbye!");
                                break;
                        case 1:
                                System.out.println("\nAll items in our shop:");
                                for (Laptop item : laptopSet) {
                                        System.out.println(item.itemName);
                                }
                                break;
                        case 2:
                                System.out.println("\nPress number to filter:\n"
                                                + "1 - brand\n2 - OS\n3 - RAM\n"
                                                + "4 - HD Size\n5 - If laptop in stock\n0 - Exit");
                                int inputFilter = askInt();
                                switch (inputFilter) {
                                        case 0:
                                                System.out.println("Goodbye!");
                                                break;
                                        case 1:
                                                Map<Integer, String> map1 = Laptop.filterLaptopBrand(laptopSet);
                                                System.out.println("\nSelect brand from the list:\n"
                                                                + map1);
                                                int inputFilter2 = askInt();
                                                System.out.println("\nLaptop(s) for you:");
                                                Laptop.filter2LaptopBrand(map1, laptopSet, inputFilter2);
                                                break;
                                        case 2:
                                                Map<Integer, String> map2 = Laptop.filterLaptopOS(laptopSet);
                                                System.out.println("\nSelect OS from the list:\n"
                                                                + map2);
                                                int inputFilter2_1 = askInt();
                                                System.out.println("\nLaptop(s) for you:");
                                                Laptop.filter2LaptopOS(map2, laptopSet, inputFilter2_1);
                                                break;
                                        case 3:
                                                Map<Integer, Integer> map3 = Laptop.filterLaptopRAM(laptopSet);
                                                System.out.println("\nSelect RAM Size from the list:\n"
                                                                + map3);
                                                int inputFilter2_2 = askInt();
                                                System.out.println("\nLaptop(s) for you:");
                                                Laptop.filter2LaptopRAM(map3, laptopSet, inputFilter2_2);
                                                break;
                                        case 4:
                                                Map<Integer, Integer> map4 = Laptop.filterLaptopHDSize(laptopSet);
                                                System.out.println("\nSelect HD Size from the list:\n"
                                                                + map4);
                                                int inputFilter2_3 = askInt();
                                                System.out.println("\nLaptop(s) for you:");
                                                Laptop.filter2LaptopHDSize(map4, laptopSet, inputFilter2_3);
                                                break;
                                        case 5:
                                                Map<Integer, Boolean> map5 = Laptop.filterLaptopIfInStock(laptopSet);
                                                System.out.println("\nSelect digit from the list:\n"
                                                                + map5);
                                                int inputFilter2_4 = askInt();
                                                System.out.println("\nLaptop(s) for you:");
                                                Laptop.filter2LaptopIfInStock(map5, laptopSet, inputFilter2_4);
                                                break;

                                        default:
                                                System.out.println("Something's wrong, try again please");
                                                break;
                                }

                                break;
                        default:
                                System.out.println("Something's wrong, try again");
                                break;
                }
        }

        public static int askInt() {
                try {
                        Scanner iScanner = new Scanner(System.in);
                        int inputNum = iScanner.nextInt();
                        return inputNum;

                } catch (Exception e) {
                        System.out.println("Error, it's not a number.");
                        return -1;
                }
        }

}
