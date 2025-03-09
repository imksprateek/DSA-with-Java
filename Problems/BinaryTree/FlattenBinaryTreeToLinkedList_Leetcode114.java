package Problems.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenBinaryTreeToLinkedList_Leetcode114 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.right = new Node(4);
        root.left.left = new Node(3);
        root.right.right = new Node(6);

        flatten(root);

        System.out.println(root.value);
    }

    public static void flatten(Node root) {
        Queue<Node> result = new LinkedList<Node>();

        preOrder(root, result);

        Node temp = result.poll();
        while (!result.isEmpty()) {
            temp.left = null;
            temp.right = result.poll();
            temp = temp.right;
        }
    }

    public static void preOrder(Node node, Queue<Node> q){
        if(node == null){
            return;
        }

        q.add(node);
        preOrder(node.left, q);
        preOrder(node.right, q);
    }


}
