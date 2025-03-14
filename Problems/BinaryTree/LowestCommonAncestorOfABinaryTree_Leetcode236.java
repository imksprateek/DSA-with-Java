package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree.Node;

public class LowestCommonAncestorOfABinaryTree_Leetcode236 {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(6);

        System.out.println(lowestCommonAncestor(root, root.right.left, root.right.right).value);
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root == null){
            return null;
        }

        if(root.value == p.value || root.value == q.value){
            return root;
        }

        Node left = lowestCommonAncestor(root.left, p,q);
        Node right = lowestCommonAncestor(root.right, p,q);

        if(left != null && right != null){
            return root;
        }

        if(left == null && right != null){
            return right;
        }else if(right == null && left != null){
            return left;
        }

        return null;
    }
}
