package Concepts.Recursion.ProblemsForConcept.string;

public class SkipCharacter {
    public static void main(String[] args) {
        String str = "baccad";
        char skip = 'a';

        String result = skipCharFromBody(str,skip,0);
        String alternateResult = skipCharFromArgs(str, skip,0, new StringBuilder());
        System.out.println(result);
        System.out.println(alternateResult);
    }

    private static String skipCharFromBody(String str, char skip, int cur) {
        StringBuilder result = new StringBuilder();

        if(cur == str.length()){
            return result.toString();
        }

        if(str.charAt(cur) != skip){
            result.append(str.charAt(cur));
        }
        return result.append(skipCharFromBody(str, skip, cur+1)).toString();
    }

    private static String skipCharFromArgs(String str, char skip,int cur, StringBuilder result){
        if(cur == str.length()){
            return result.toString();
        }
        if(str.charAt(cur) != skip){
            StringBuilder newResult = result.append(str.charAt(cur));
            return skipCharFromArgs(str,skip,cur+1, newResult);
        }
        return skipCharFromArgs(str, skip, cur+1, result);
    }
}
