package Problems.Recursion.ProblemsForConcept.string;

public class SkipCharacter {
    public static void main(String[] args) {
        String str = "baccad";
        char skip = 'a';

        String result = skipCharFromBody(str,skip,0);
        String alternateResult = skipCharFromArgs(str, skip,0, new StringBuilder());
        System.out.println(result);
        System.out.println(alternateResult);
        System.out.println(skipCharFromBody2(str,skip,0));
        System.out.println(skipCharFromArgsWithStream(str));
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

    private static String skipCharFromBody2(String str, char skip, int cur){
        if(cur == str.length()){
            return "";
        }
        if(str.charAt(cur) != skip){
            return str.charAt(cur) + skipCharFromBody2(str,skip,cur+1);
        }
        return skipCharFromBody2(str, skip, cur+1);
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

    private static String skipCharFromArgsWithStream(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);
        if(ch == 'a'){
            return skipCharFromArgsWithStream(str.substring(1));
        }else{
            return ch + skipCharFromArgsWithStream(str.substring(1));
        }
    }
}
