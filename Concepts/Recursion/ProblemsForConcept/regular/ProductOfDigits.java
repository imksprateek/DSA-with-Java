package Concepts.Recursion.ProblemsForConcept.regular;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(product(103));
    }

    public static int product(int n){
        if(n<10){
            return n;
        }
        return n%10*product(n/10);
    }
}
