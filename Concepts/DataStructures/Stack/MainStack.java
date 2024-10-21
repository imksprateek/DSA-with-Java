package Concepts.DataStructures.Stack;

public class MainStack {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.displayStack();

        System.out.println("Popped element: " + stack.pop());
        stack.displayStack();

        stack.pop();
        stack.pop();
        stack.pop();
    }
}
