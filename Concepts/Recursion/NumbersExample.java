package Concepts.Recursion;

public class NumbersExample {
    public static void main(String[] args) {
        //This is an example to understand how recursion works. Recursive way of doing this is written in the file NumbersExampleRecursion.java
        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }
    static void print4(int n) {
        System.out.println(n);
    }
}
