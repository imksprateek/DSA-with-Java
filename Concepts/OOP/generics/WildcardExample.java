package oops.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardExample<T extends Number> {
    //Here, T can only be number types like Integer, Float
    private Object[] data;

    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample() {
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

    public void getListMethod(List<Number> list) {
        //do something

        //Here you can only pass number type, but not it's subclasses.
    }

    public void getList(List<? extends Number> list) {
        //do something

        //Here you can pass Number type and it's subclasses.
        //Number's Subclasses are Integer, Float
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
        WildcardExample<Integer> newlist = new WildcardExample<>();
//        WildcardExample<String> newlist2 = new WildcardExample<>();
//        The type parameter should only be Number of its subclasses.
        newlist.add(3);
        System.out.println(newlist.size());
        newlist.add(7);
//        newlist.add("ewew"); Can't do this
        newlist.add(9);
        System.out.println(newlist);
        newlist.remove();

        for (int i = 0; i < 14; i++) {
            newlist.add(2 * i);
        }
        System.out.println(newlist);
    }
}
