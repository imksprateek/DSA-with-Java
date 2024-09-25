package Concepts.Recursion.ProblemsForConcept.regular;

public class ReverseAnumber {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    public static int reverse(int n){
        if(n<10){
            return n;
        }
        return  (n%10)* (int)Math.pow(10, (int)Math.log10(n) + reverse(n/10));
    }
}
