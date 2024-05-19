package oops.collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //Collections framework provides default implementations of various data structures
        //Two main components are Collection and Map. These two are interfaces
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(3);
        list2.add(6);
        list2.add(9);
        list2.add(59);

        System.out.println(list2);

        //Difference between ArrayList and Vector is that ArrayList object can be accessed by multiple threads at once, but Vector can only be accessed by a single thread at once
        // Hence ArrayList is faster
        // ArrayList is not synchronized, Vector is synchronized hence vector can only be accessed by single thread at a time
        // ArrayList can also be made synchronized using collections framework. So ArrayList is preferred most of the time
        List<Integer> vector = new Vector<>();
        vector.add(4);
        vector.add(8);
        vector.add(12);
        vector.add(73);
        System.out.println(vector);
    }
}
