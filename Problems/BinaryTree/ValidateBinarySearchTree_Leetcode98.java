package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree.Node;

public class ValidateBinarySearchTree_Leetcode98 {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(6);

        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(Node root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean check(Node node, long min, long max){
        if(node == null){
            return true;
        }
        if (node.value <= min || node.value >= max) return false;

        return check(node.left, min, node.value) && check(node.right, node.value, max);
    }
}
