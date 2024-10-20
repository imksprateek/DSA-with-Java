package Concepts.DataStructures.Stack;

import java.util.Stack;

public class GenericStack {
    public static void main(String[] args) {
        //Note that Stack is a class but Queue is an interface. Java internally uses Array for Stack
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //Push and pop both return the Integer that the operation was performed with
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //Only one item is left in stack after it was popped 4 times
        System.out.println(stack.toString());

        //If empty stack is popped, it throws an exception - EmptyStackException
        stack.pop();
        try{
            stack.pop();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
