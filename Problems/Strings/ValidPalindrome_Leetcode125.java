package Problems.Strings;

public class ValidPalindrome_Leetcode125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder lower = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            int current = (int) s.charAt(i);
            if((current>=48 && current<=57) || (current>=65 && current<=90) || (current>=97 && current<=122)){
                lower.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        for(int i=0; i<lower.length()/2; i++){
            if(lower.charAt(i) != lower.charAt(lower.length()-i-1)){
                return false;
            }
        }

        return true;
    }
}
