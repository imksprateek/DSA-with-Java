package Concepts.DataStructures.Queue;

public class MainDynamicQueue {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue(3);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.displayQueue();

        queue.insert(4);
        queue.displayQueue();
    }
}
