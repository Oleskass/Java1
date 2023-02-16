package java_seminars;

import java.util.HashMap;

public class seminar5_task3 {
    /*
     * Напистаь метод, который переведёт число из римского формата записи в арабский
     * Например MMXXII = 2022
     */
    public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);

        System.out.println(ConvertRomeToArab(numbers, "XLIV"));
    }

    static Integer ConvertRomeToArab(HashMap<String, Integer> map, String romeNum) {
        int acc = 0;
        // for (String i : romeNum.split("")) {
        // acc += map.get(i);
        // }

        String[] romeNumArr = romeNum.split("");
        for (int i = 0; i < romeNumArr.length - 1; i++) {
            if (map.get(romeNumArr[i]) < map.get(romeNumArr[i + 1])) {
                acc -= map.get(romeNumArr[i]);
            } else
                acc += map.get(romeNumArr[i]);
        }
        acc += map.get(romeNumArr[romeNumArr.length - 1]);
        return acc;
    }
}
