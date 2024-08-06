package Concepts.Recursion;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //This code for fibonacci numbers has a Linear Recurrence relation
        System.out.println("How many numbers: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i <= n; i++) {
//            System.out.print(fibonacci(i) + "\t");
            System.out.print(fiboFormula(i) + "\t");
        }
    }

    static int fiboFormula(int n){
        return (int) ((Math.pow((1+Math.sqrt(5))/2, n) - Math.pow((1-Math.sqrt(5))/2, n)) / Math.sqrt(5));
    }

    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
