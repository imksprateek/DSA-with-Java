package Problems.Recursion.ProblemsForConcept.regular;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(12321));
    }

    public static boolean checkPalindrome(int n){
        if(n/10 == 0){
            return true;
        }
        int last = n%10;
        int first = n/(int)Math.pow(10, (int)Math.log10(n));
        System.out.println(first + " " + last);
        int next = n% (int)Math.pow(10, (int)Math.log10(n))/10;
        System.out.println(next);

        if(first == last){
            return checkPalindrome(next);
        }
        return false;
    }
}
