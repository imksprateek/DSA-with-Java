package Concepts.Recursion.ProblemsForConcept.string;

import java.sql.SQLOutput;

public class SkipString {
    public static void main(String[] args) {
        String str = "thisisanapplepieapp";
        System.out.println(skipString(str, "apple"));
        //Only skip app when there's no apple. Otherwise don't skip
        System.out.println(skipStringWhenNoCond(str, "apple", "app"));
    }

    public static String skipString(String str, String skip){
        if(str.isEmpty()){
            return "";
        }
        if(str.length() >= skip.length()){
            String sub = str.substring(0,skip.length());
            if(sub.equals(skip)){
                return skipString(str.substring(skip.length()), skip);
            }
        }
        return str.charAt(0) + skipString(str.substring(1), skip);
    }

    public static String skipStringWhenNoCond(String str, String skip, String cond){
        if(str.isEmpty()){
            return "";
        }
        if(str.length() >= cond.length()){
            String sub = (str.length() > skip.length())?str.substring(0,skip.length()):str;
            if(!sub.equals(skip) && sub.substring(0,cond.length()).equals(cond)){
                return skipStringWhenNoCond(str.substring(cond.length()), skip, cond);
            }
        }
        return str.charAt(0) + skipStringWhenNoCond(str.substring(1), skip, cond);
    }
}
