package Concepts.Recursion;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println("How many numbers: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + "\t");
        }
    }

    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
