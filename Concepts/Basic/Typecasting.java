package Concepts.Basic;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte num1 = input.nextByte();
        byte factor = 10;
        int result = num1 * factor;
        System.out.println(3.5 * 2 + "string");
        if (num1 == 50) {
            System.out.println("It's 50");
        } else {
            System.out.println("It's not 50");
        }
    }
}
