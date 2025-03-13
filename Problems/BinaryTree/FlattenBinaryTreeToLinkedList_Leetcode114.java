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

    //Less optimal solution using DFS and Queue, O(n) space
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



    //Most Optimal approach, using O(1) space
    public static void flattenOptimally(Node root) {
        if(root == null){
            return;
        }
        Node current = root;

        while(current != null){
            if(current.left != null){
                Node temp = current.left;

                while(temp.right != null){
                    temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }

    }


}
