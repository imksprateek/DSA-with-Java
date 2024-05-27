package Problems.Strings;

public class SortingTheSentence_Leetcode1859 {

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String s2 = "pTY1";
        String s3 = "Myself2 Me1 I4 and3";

        System.out.println(sortSentence(s));
        System.out.println(sortSentence(s2));
        System.out.println(sortSentence(s3));
    }

    public static String sortSentence(String s) {
        StringBuilder result = new StringBuilder();
        int indexStart = 0;
        int indexEnd = 0;

        for(int i=1; i<=9; i++){
            for(int j=0; j<s.length(); j++){
                if(j==0){
                    indexStart = j;
                }
                else if(s.charAt(j) == ' '){
                    indexStart = j+1;
                }
                else if(s.charAt(j) == (char)(i + '0')){
                    indexEnd = j-1;
                    break;
                }
            }
            if(result.length() >= s.length()-i){
                break;
            }
            append(s, result, indexStart, indexEnd);
        }

        return result.toString().trim();
    }

    public static void append(String s, StringBuilder result, int start, int end){
        for(int i=start; i<=end; i++){
            result.append(s.charAt(i));
        }
        result.append(" ");
    }
}
