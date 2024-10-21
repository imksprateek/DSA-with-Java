package Concepts.DataStructures.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    CustomStack(){
        //Call the other constructor using this keyword
        this(DEFAULT_SIZE);
    }

    CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            return false;
        }
        top++;
        data[top] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        int removed = data[top];
        top--;
        return removed;

        //OR we can just return data[top--] instead of above 3 lines
    }

    public void displayStack(){
        for(int i=0; i<=top; i++){
            System.out.print(data[i] + "\t");
        }
        System.out.print("<-- Top");
        System.out.println();
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(top == data.length-1){
            return true;
        }
        return false;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek in an Empty stack");
        }
        return data[top];
    }
}
