package java_seminars;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class seminar4_task3 {

    public static void main(String[] args) {
        /*
         * 1) Написать метод, который принимает массив элементов, помещает их
         * в стэк и выводит на консоль содержимое стэка.
         * 2) Написать метод, который принимает массив элементов, помещает их в очередь
         * и выводит на консоль содержимое очереди.
         */
        int[] arr1 = new int[] { 1, 2, 3, 4, 7, 88 };
        Stack<Integer> newStack = ArrayToStack(arr1);
        System.out.println("Stack:");
        System.out.println(newStack);
        newStack.pop();
        System.out.println(newStack);
        newStack.pop();
        System.out.println(newStack);

        Queue<Integer> newQueue = ArrayToQueue(arr1);
        System.out.println("Queue:");
        System.out.println(newQueue);
        newQueue.poll();
        System.out.println(newQueue);
        newQueue.poll();
        System.out.println(newQueue);

    }

    public static Stack<Integer> ArrayToStack(int[] arr) {
        Stack<Integer> st = new Stack<Integer>();
        for (int number : arr) {
            st.push(number);
        }
        return st;
    }

    public static Queue<Integer> ArrayToQueue(int[] arr) {
        Queue<Integer> qu = new LinkedList<Integer>();
        for (int number : arr) {
            qu.add(number);
        }
        return qu;
    }
}
