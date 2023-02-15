package java_homework;

import java.util.LinkedList;
import java.util.Queue;

public class sem4task2 {
    /*
     * Семинар 4. Задание 2.
     * Создать очередь с помощью LinkedList и реализовать следующие методы:
     * enqueue() - помещает элемент в конец очереди,
     * dequeue() - возвращает первый элемент из очереди и удаляет его,
     * first() - возвращает первый элемент из очереди, не удаляя.
     * Вызвать полученные методы и убедиться в их работоспособности.
     */
    public static void main(String args[]) {
        try {
            Queue<Integer> ourQueue = new LinkedList<Integer>();
            System.out.println("Помещаем элементы в конец очереди с помощью метода Enqueue():");
            Enqueue(55, ourQueue);
            System.out.println(ourQueue);
            Enqueue(88, ourQueue);
            System.out.println(ourQueue);
            Enqueue(111, ourQueue);
            System.out.println(ourQueue);
            System.out.println("Метод Dequeue() - покажет первый элемент очереди и удалит его:");
            Dequeue(ourQueue);
            System.out.println(ourQueue);
            System.out.println("Метод First() - просто покажет первый элемент очереди:");
            First(ourQueue);
            System.out.println(ourQueue);

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }

    public static void Enqueue(int element, Queue<Integer> inputQueue) {
        inputQueue.add(element);
    }

    public static void Dequeue(Queue<Integer> inputQueue) {
        System.out.println(inputQueue.peek());
        inputQueue.poll();
    }

    public static void First(Queue<Integer> inputQueue) {
        System.out.println(inputQueue.peek());
    }
}
