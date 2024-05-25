package Concepts.Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1278f;

        //To print float a with 2 decimal digits (Rounding off to 2 decimal digits)
        System.out.printf("Formatted number is %.2f", a);

        System.out.println(Math.PI);
        System.out.printf("Value of Pi is: %.3f" , Math.PI);
        System.out.println();

        //Placeholders
        System.out.printf("Hello my name is %s and I am an %s", "Prateek", "Engineer");
    }
}
