package Problems.LinkedList;

public class HappyNumber_LeetCode202 {
    /*
    Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.



Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
     */

    /*
    Can be solved by using slow pointer - fast pointer approach like in LinkedList cycle
     */
    public static void main(String[] args) {
        System.out.println(isHappy(16));
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int fastPointer = n;
        int slowPointer = n;

        do{
            slowPointer = squareSum(slowPointer);
            fastPointer = squareSum(squareSum(fastPointer));
            if(slowPointer == 1){
                return true;
            }
        }while(fastPointer != slowPointer);

        return false;
    }

    public static int squareSum(int n){
        int sum = 0;
        int digit;

        while(n!=0){
            digit = n % 10;
            sum += (digit * digit);
            n = n/10;
        }
        return sum;
    }
}
