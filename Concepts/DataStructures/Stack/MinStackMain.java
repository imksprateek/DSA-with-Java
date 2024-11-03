package Concepts.DataStructures.Stack;

public class MinStackMain {
    public static void main(String[] args) throws StackException {
        MinStack min = new MinStack();

        min.push(4);
        min.push(5);
        min.push(3);
        min.push(6);

        min.displayStack();
        System.out.println("Min: " + min.getMin());

        System.out.println("Popped: " + min.pop());
        System.out.println("Min: " + min.getMin());
        System.out.println("Popped: " + min.pop());
        System.out.println("Min: " + min.getMin());

        min.displayStack();
    }
}
