package Concepts.DataStructures.Queue;

public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int front = 0;
    private int end = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        data = new int[size];
    }

    public boolean insert(int val){
        if(this.isFull()){
            return false;
        }

        data[end++] = val;
        end = (end) % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Cannot remove from an empty Queue");
        }

        int removed = data[front++];

        front = (front) % data.length;
        size--;
        return removed;
    }

    public void displayQueue() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Queue is empty");
        }

        System.out.print("START -->\t");
        int i = front;
        do{
            System.out.print(data[i] + "\t");
            i++;
            i = i % data.length;
        }while(i != end);

        System.out.print("<-- END");
        System.out.println();
    }

    public boolean isFull(){
        if(size == data.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
}
