package Concepts;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inp = input.next();
        char var = inp.trim().charAt(0);
        System.out.println(inp);
        System.out.println(var);
        if (var >= 'a' && var <= 'z') {
            System.out.println("Small");
        } else {
            System.out.println("Capital");
        }

    }
}
