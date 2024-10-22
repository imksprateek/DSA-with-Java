package Problems.StacksAndQueues;

import java.util.Stack;

public class QueueUsingStacks_Leetcode232 {
    public static void main(String[] args) {
        //In this example, pop = dequeue, push = enqueue, peek refers to element at start of queue

        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();

        System.out.println("Popped: " + param_2);
        System.out.println("Peek: " + param_3);
        System.out.println("Is empty: " + param_4);
    }
}

class MyQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack();
        second = new Stack();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = (int) second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        return (int) first.firstElement();
    }

    public boolean empty() {
        return first.size() == 0;
    }
}
