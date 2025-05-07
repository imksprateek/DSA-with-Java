package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree.Node;

public class BalancedBinaryTree_Leetcode110 {
    public static void main(String[] args) {
        BinaryTree.Node root = new BinaryTree.Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);
        root.left.right = new BinaryTree.Node(5);
        root.left.left = new BinaryTree.Node(4);
        root.right.left = new BinaryTree.Node(6);
        root.right.right = new BinaryTree.Node(7);
        root.left.left.left = new BinaryTree.Node(8);
        root.left.left.right = new BinaryTree.Node(9);
        root.right.left.left = new BinaryTree.Node(10);
        root.right.right.right = new BinaryTree.Node(11);

        System.out.println(isBalanced(root));



        BinaryTree.Node nRoot = new BinaryTree.Node(1);
        nRoot.left = new BinaryTree.Node(2);
        nRoot.right = new BinaryTree.Node(2);
        nRoot.left.right = new BinaryTree.Node(3);
        nRoot.left.left = new BinaryTree.Node(3);
        nRoot.left.left.left = new BinaryTree.Node(4);
        nRoot.left.left.right = new BinaryTree.Node(4);

        System.out.println(isBalanced(nRoot));
    }

    public static boolean isBalanced(Node root) {
        if(root == null){
            return true;
        }

        if(getHeight(root) == -1){
            return false;
        }

        return true;
    }

    public static int getHeight(Node node){
        if(node == null){
            return 0;
        }

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        if(left == -1 || right == -1){
            return -1;
        }

        if(Math.abs(left - right) > 1){
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
