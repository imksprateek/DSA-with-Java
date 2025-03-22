package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree.Node;

public class SumRootToLeafNumbers_Leetcode129 {

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.right = new Node(2);

        System.out.println(sumNumbers(root));
    }

    public static int sumNumbers(Node root) {
        return sumNumbersHelper(root, 0);
    }

    private static int sumNumbersHelper(Node root, int sum){
        if(root == null){
            return 0;
        }
        int newSum = 0;
        if(root.left == null && root.right == null){
            newSum += (sum * 10) + root.value;
            return newSum;
        }

        newSum += sumNumbersHelper(root.left, sum*10 + root.value);
        newSum += sumNumbersHelper(root.right, sum*10 + root.value);

        return newSum;
    }
}
