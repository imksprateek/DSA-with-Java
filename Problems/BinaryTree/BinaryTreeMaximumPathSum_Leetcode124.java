package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree.Node;

public class BinaryTreeMaximumPathSum_Leetcode124 {
    public static void main(String[] args) {
        BinaryTree.Node root = new BinaryTree.Node(3);
        root.left = new BinaryTree.Node(1);
        root.right = new BinaryTree.Node(4);
        root.left.right = new BinaryTree.Node(2);

        System.out.println(maxPathSum(root));
    }

    static int max = Integer.MIN_VALUE;

    public static int maxPathSum(Node root) {
        maxPathSumHelper(root);
        return max;
    }

    private static int maxPathSumHelper(Node node){
        if(node == null){
            return 0;
        }

        int left = Math.max(0, maxPathSumHelper(node.left));
        int right = Math.max(0, maxPathSumHelper(node.right));

        max = Math.max(max, left+right+node.value);

        return Math.max(left, right) + node.value;
    }


}
