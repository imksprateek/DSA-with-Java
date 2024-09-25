package Concepts.Recursion.ProblemsForConcept;

public class NumberOfZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(12040500));
    }

    public static int countZeros(int n){
        if(n/10 < 10){
            return 0;
        }
        if(n%10 == 0){
            return 1 + countZeros(n/10);
        }
        return countZeros(n/10);
    }
}
