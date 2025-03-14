package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree.Node;

public class KthSmallestElementInABST_Leetcode230 {
    static int count = 0, val = 0;
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.right = new Node(2);

        System.out.println(kthSmallest(root, 2));
    }

    public static int kthSmallest(Node root, int k) {
        inOrder(root, k);
        return val;
    }

    public static void inOrder(Node node, int k){
        if(node==null){
            return;
        }
        inOrder(node.left, k);
        count++;
        if(count == k){
            val = node.value;
            return;
        }
        inOrder(node.right, k);
    }
}
