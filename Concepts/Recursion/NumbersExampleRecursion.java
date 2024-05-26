package Concepts.Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //Implementing NumbersExample.java using Recursion
        print(1);
    }

    static void print(int n) {
        if(n==5){
            return;
        }
        System.out.println(n);
        print(n+1);
        //The above is called tail recursion because the above line is the last function call
    }
}
