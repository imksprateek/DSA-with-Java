package Problems.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "malayalam";

        System.out.println(isPalindrome1(str));
        System.out.println(isPalindrome2(str));
    }

    public static boolean isPalindrome1(String str) {
        if(str == null || str.length() == 0){
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        int start = 0;
        int end = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if(start == end){
                break;
            }
            if(str.charAt(i)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
