package Problems.StacksAndQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class GameOfTwoStacks_HackerRank {
    public static void main(String[] args) {
        // Question link:
        // https://www.hackerrank.com/challenges/game-of-two-stacks/problem
        List<Integer> one = new ArrayList<Integer>();
        List<Integer> two = new ArrayList<Integer>();
        one.add(4);
        one.add(2);
        one.add(4);
        one.add(6);
        one.add(1);

        two.add(2);
        two.add(1);
        two.add(8);
        two.add(5);

        System.out.println("Maximum number of values Nick can remove: " + twoStacks(10, one, two));
    }

    public static int numberOfValues(List<Integer> first, List<Integer> second, int maxSum, int currSum, int ops) {
        if (currSum > maxSum) {
            return ops - 1;
        }

        if (first.isEmpty() && second.isEmpty()) {
            return ops;
        }

        int firstAns = 0, secondAns = 0;

        if (!first.isEmpty()) {
            firstAns = numberOfValues(first.subList(1, first.size()), second, maxSum, currSum + first.get(0), ops + 1);
        }

        if (!second.isEmpty()) {
            secondAns = numberOfValues(first, second.subList(1, second.size()), maxSum, currSum + second.get(0), ops + 1);
        }

        return Math.max(firstAns, secondAns);
    }

    private static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return numberOfValues(a, b, maxSum,0, 0);
    }
}