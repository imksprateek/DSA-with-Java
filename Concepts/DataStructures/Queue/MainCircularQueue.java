package Concepts.DataStructures.Queue;

public class MainCircularQueue {
    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue();

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.displayQueue();

        queue.remove();
        queue.displayQueue();

        queue.insert(5);
        queue.displayQueue();

        //In circular queue, time complexity for insertion and deletion is O(1). For display it's O(n)
    }
}
