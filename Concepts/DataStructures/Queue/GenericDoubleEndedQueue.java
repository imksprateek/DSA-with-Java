package Concepts.DataStructures.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class GenericDoubleEndedQueue {
    public static void main(String[] args) {
        //Double Ended queue (Dequeue), pronounced as Deck. We use ArrayDequeue class to create dequeue object. ArrayDequeue by default implements Dequeue interface. ArrayDequeue has a resizeable array (No capacity restrictions). ArrayDequeue object is faster than a LinkedList queue object when used as queue and than a stack object when used as a stack.
        //ArrayDequeue is not threadsafe. It doesn't allow null values

        //In dequeue insertion and deletion can be done from both the ends of queue
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        System.out.println(deque);

        deque.addFirst(2);
        System.out.println(deque);

        deque.addLast(3);
        System.out.println(deque);

        deque.remove();
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);

    }
}
