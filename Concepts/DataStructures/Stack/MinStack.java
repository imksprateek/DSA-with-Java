package Concepts.DataStructures.Stack;

public class MinStack extends CustomStack{
    int min = Integer.MAX_VALUE;

    @Override
    public int pop() throws StackException {
        if(this.isEmpty()){
            throw new StackException("Cannot pop from empty stack");
        }
        int ele = super.pop();
        if(ele < min){
            int temp = min;
            min = 2 * min - ele;
            return temp;
        }
        return ele;
    }

    @Override
    public boolean push(int item) {
        if(this.isEmpty()){
            min = item;
            return super.push(item);
        }
        if(item < min){
            int newItem = 2 * item - min;
            super.push(newItem);
            min = item;
            return true;
        }else{
            return super.push(item);
        }
    }

    @Override
    public int peek() throws StackException {
        if(this.isEmpty()){
            return -1;
        }
        int ele = super.peek();
        if(ele < min){
            return min;
        }
        return ele;
    }

    public int getMin() throws StackException{
        if(this.isEmpty()){
            throw new StackException("Stack is Empty");
        }
        return min;
    }

    @Override
    public void displayStack() {
        int tempMin = min;
        for(int i=0; i<=top; i++){
            if(data[i] > tempMin){
                System.out.print(data[i] + "\t");
            }else{
                int curr = data[i];
                System.out.print(tempMin + "\t");
                tempMin = 2 * tempMin - curr;
            }
        }
        System.out.print("<-- Top");
        System.out.println();
    }
}
