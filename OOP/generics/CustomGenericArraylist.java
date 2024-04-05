package oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

//Type parameters cannot be static
//Overloading for Generic Types is not allowed, because it will generate a compile time error
//instanceof operator cannot be used for generics because here, generic type is being used at runtime

public class CustomGenericArraylist<T> {
    private Object[] data;

    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        //Copy the current items into the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
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

    public void set(int index, T value) {
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

        CustomGenericArraylist<Integer> newlist = new CustomGenericArraylist();
        newlist.add(3);
        System.out.println(newlist.size());
        newlist.add(7);
        list.add("ewew");
        newlist.add(9);
        System.out.println(newlist);
        newlist.remove();

        for (int i = 0; i < 14; i++) {
            newlist.add(2 * i);
        }
        System.out.println(newlist);
    }
}
