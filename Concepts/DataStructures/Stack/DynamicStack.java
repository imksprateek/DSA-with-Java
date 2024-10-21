package Concepts.DataStructures.Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int value){
        if(this.isFull()){
            this.extendSize();
        }
        data[++top] = value;
        return true;
    }

    public void extendSize(){
        int[] newData = new int[2*data.length];
        for(int i=0; i<data.length; i++){
            newData[i] = data[i];
            top = i;
        }
        data = newData;
    }
}
