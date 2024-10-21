package Concepts.DataStructures.Queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = -1;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        data = new int[size];
    }

    public boolean insert(int val){
        if(this.isFull()){
            return false;
        }

        data[++end] = val;
        return true;
    }

    public int remove() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Cannot remove from an empty Queue");
        }

        int removed = data[0];
        for(int i=0; i<=data.length-2; i++){
            data[i] = data[i+1];
        }
        end--;
        return removed;
    }

    public void displayQueue(){
        System.out.print("START -->\t");
        for(int i=0; i<=end; i++){
            System.out.print(data[i] + "\t");
        }
        System.out.print("<-- END");
        System.out.println();
    }

    public boolean isFull(){
        if(end == data.length-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(end == -1){
            return true;
        }
        return false;
    }
}
