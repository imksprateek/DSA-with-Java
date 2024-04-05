package oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;

    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        //Copy the current items into the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

//    public void display() {
//        for (int i = 0; i <= size; i++) {
//            System.out.print(data[i] + " ");
//        }
//        System.out.println();
//    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + "}";
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }


    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//        list.add(45);
//        list.get(0);
//        list.set(1, 450);
//        list.size();
//        list.isEmpty();

        CustomArrayList newlist = new CustomArrayList();
        newlist.add(3);
        System.out.println(newlist.size());
        newlist.add(7);
        newlist.add(7);
//        newlist.add("ewfw"); Can't do this
        System.out.println(newlist);
        newlist.remove();
        System.out.println(newlist);
    }
}
