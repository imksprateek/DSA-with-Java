package Concepts.Basic.Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 1;
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        fibo(n);

//        System.out.println(num1);
//        System.out.println(num2);
//        for (int i = 1; i <= n; i++) {
//
//        }
    }

    public static void fibo(int n) {
        int num1 = 0, num2 = 1, sum = 0;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 0; i < n - 2; ++i) {
            sum = num1 + num2;
            System.out.println(sum + ",");
            num1 = num2;
            num2 = sum;
        }
    }
}
