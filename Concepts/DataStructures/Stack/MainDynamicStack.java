package Concepts.DataStructures.Stack;

public class MainDynamicStack {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);

        stack.displayStack();

        //Default size was 10, but the Dynamic stack extends its size accordingly. It has no size limit
    }
}
