package Concepts.Recursion.ProblemsForConcept.string;

public class SkipString {
    public static void main(String[] args) {
        String str = "thisisanapplepie";
        System.out.println(skipString(str, "apple"));
    }

    public static String skipString(String str, String skip){
        if(str.isEmpty()){
            return "";
        }
        if(str.length() > skip.length()){
            String sub = str.substring(0,skip.length());
            if(sub.equals(skip)){
                return skipString(str.substring(skip.length()), skip);
            }
        }
        return str.charAt(0) + skipString(str.substring(1), skip);
    }
}
