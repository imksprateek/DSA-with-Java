package Problems.Strings;

public class LongestPalindromicSubstring_Leetcode5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babab"));
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        if(s==null || s.length() == 0){
            return "";
        }

        int leftPtr=0;
        int rightPtr=0;
        String longest = "";

        for(int i=0; i<s.length(); i++){
            String oddPalindrome = expandAroundCenter(s, i, i);
            String evenPalindrome = expandAroundCenter(s, i, i+1);

            if(oddPalindrome.length() > longest.length()){
                longest = oddPalindrome;
            }
            if(evenPalindrome.length() > longest.length()){
                longest = evenPalindrome;
            }
        }

        return longest;
    }

    public static String expandAroundCenter(String s, int leftPtr, int rightPtr){
        while((leftPtr>=0 && rightPtr<s.length()) && s.charAt(leftPtr) == s.charAt(rightPtr)){
            leftPtr--;
            rightPtr++;
        }

        return s.substring(leftPtr+1, rightPtr);
    }
}
