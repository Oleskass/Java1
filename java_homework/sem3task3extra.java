package java_homework;

public class sem3task3extra {
    /*
     * Семинар 3. Задание 3*.
     * Реализовать алгоритм сортировки пузырьком
     */
    public static void main(String args[]) {
        try {
            int[] arr = new int[] { 3, 6, 2, 9, 8, 4, 0, 7, 5, 8, 9, 8 };
            int temp;
            System.out.println(arr.length);

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1; j++) {

                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
