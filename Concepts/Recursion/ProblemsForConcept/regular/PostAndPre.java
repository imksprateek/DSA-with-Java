package Concepts.Recursion.ProblemsForConcept.regular;

public class PostAndPre {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
//        print(n--); //Infinite recursion since n-- first passes the value and then decrements
        print(--n);  // --n decrements the value first and then passes it
    }
}
