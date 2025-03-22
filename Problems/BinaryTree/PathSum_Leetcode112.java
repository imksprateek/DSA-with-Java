package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree.Node;

public class PathSum_Leetcode112 {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.right = new Node(2);

        System.out.println(hasPathSum(root, 7));
        System.out.println(hasPathSum(root, 4));
        System.out.println(hasPathSum(root, 6));
    }

    public static boolean hasPathSum(Node root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null && targetSum == root.value){
            return true;
        }

        return hasPathSum(root.left, targetSum-root.value) || hasPathSum(root.right, targetSum-root.value);
    }
}
