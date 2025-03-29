package Problems.StacksAndQueues;

import java.util.Stack;

public class RemoveKDigits_Leetcode402 {
    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3));
    }

    public static String removeKdigits(String num, int k) {
        if(k==0){
            return num;
        }
        if(k>=num.length()){
            return "0";
        }

        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<num.length(); i++){
            int curr = num.charAt(i) - '0';

            while(!stack.isEmpty() && stack.peek() > curr && k>0){
                stack.pop();
                k--;
            }

            stack.push(curr);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        for (Integer digit : stack) {
            if (result.length() == 0 && digit == 0) {
                continue;
            }
            result.append(digit);
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
