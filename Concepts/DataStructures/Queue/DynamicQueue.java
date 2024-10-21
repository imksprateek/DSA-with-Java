package Concepts.DataStructures.Queue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int val){
        if(this.isFull()){
            extendQueue();
        }

        super.insert(val);
        return true;
    }

    public void extendQueue(){
        int[] newData = new int[2 * data.length];

        for(int i=0; i<data.length; i++){
            newData[i] = data[(front + i) % data.length];
        }
        front = 0;
        end = data.length;

        data = newData;
    }
}
