package Concepts.DataStructures.Queue;

public class MainQueue {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue();

        //O(1) time complexity for insertion into the queue
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);

        queue.displayQueue();

        //O(n) time complexity for removing an item from queue. This problem can be solved and made constant by using a circular queue
        System.out.println("Removed item: " + queue.remove());
        queue.displayQueue();
    }
}
