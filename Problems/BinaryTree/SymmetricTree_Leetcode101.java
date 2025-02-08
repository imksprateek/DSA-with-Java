package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree.Node;

public class SymmetricTree_Leetcode101 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(2);
        root.left.right = new BinaryTree.Node(4);
        root.left.left = new BinaryTree.Node(3);
        root.right.left = new BinaryTree.Node(4);
        root.right.right = new BinaryTree.Node(3);

        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(Node root) {
        return check(root.left, root.right);
    }

    public static boolean check(Node left, Node right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.value != right.value){
            return false;
        }

        return check(left.left, right.right) && check(left.right, right.left);
    }
}
