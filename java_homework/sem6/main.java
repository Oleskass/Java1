package java_homework.sem6;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class main {
        public static void main(String args[]) {
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
                // System.out.println(laptopSet);

                System.out.println("------------------------------\n"
                                + "Welcome to the Laptop catalog!\n"
                                + "------------------------------\n"
                                + "Press 1 to print all items\n"
                                + "Press 2 to search in catalog\n"
                                + "Press 0 to exit");
                Scanner iScanner = new Scanner(System.in);
                int inputNum = iScanner.nextInt();

                switch (inputNum) {
                        case 1:
                                System.out.println("\nAll items in our shop:");
                                for (Laptop item : laptopSet) {
                                        System.out.println(item.itemName);
                                }
                                break;
                        case 2:
                                System.out.println("\nPress number to filter:\n"
                                                + "1 - brand\n2 - OS\n3 - RAM\n"
                                                + "4 - HD Size\n5 - If laptop in stock");
                                int inputFilter = iScanner.nextInt();
                                switch (inputFilter) {
                                        case 1:
                                                Map<Integer, String> map1 = Laptop.filterLaptopBrand(laptopSet);
                                                System.out.println("\nSelect brand from the list:\n"
                                                                + map1);
                                                int inputFilter2 = iScanner.nextInt();
                                                System.out.println("\nLaptop(s) for you:");
                                                Laptop.filter2LaptopBrand(map1, laptopSet, inputFilter2);

                                                break;
                                        case 2:

                                                break;
                                        case 3:

                                                break;
                                        case 4:

                                                break;
                                        case 5:

                                                break;

                                        default:
                                                System.out.println("Something's wrong");
                                                break;
                                }

                                break;
                        default:
                                System.out.println("Something's wrong");
                                break;
                }
                iScanner.close();
        }

}
