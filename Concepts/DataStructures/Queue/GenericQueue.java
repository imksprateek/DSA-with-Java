package Concepts.DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue {
    public static void main(String[] args) {
        // Note that Queue is an interface but Stack is a class. Java internally uses LinkedList for Queue. LinkedList by default also implements Queue interface
        Queue<Integer> queue = new LinkedList<Integer>();

        //Enqueue operation
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.toString());

        System.out.println(queue.peek());
        //Dequeue operation
        queue.remove();

        System.out.println(queue.toString());
        System.out.println(queue.peek());
    }
}
