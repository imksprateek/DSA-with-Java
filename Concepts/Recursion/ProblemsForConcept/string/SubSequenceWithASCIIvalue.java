package Concepts.Recursion.ProblemsForConcept.string;

import java.util.ArrayList;

public class SubSequenceWithASCIIvalue {
    public static void main(String[] args) {
        subSeqWithASCII("", "ab");
        System.out.println(subSeqWithASCIIArrayList("", "ab").toString());
    }

    public static void subSeqWithASCII(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subSeqWithASCII(ch + processed, unprocessed.substring(1));
        subSeqWithASCII((int)ch + processed, unprocessed.substring(1));
        subSeqWithASCII(processed, unprocessed.substring(1));
    }

    public static ArrayList<String> subSeqWithASCIIArrayList(String processed, String unprocessed){
        ArrayList<String> result = new ArrayList<String>();
        if(unprocessed.isEmpty()){
            result.add(processed);
            return result;
        }

        char ch = unprocessed.charAt(0);
        result.addAll(subSeqWithASCIIArrayList(ch + processed, unprocessed.substring(1)));
        result.addAll(subSeqWithASCIIArrayList((int)ch + processed, unprocessed.substring(1)));
        result.addAll(subSeqWithASCIIArrayList(processed, unprocessed.substring(1)));

        return result;
    }
}
