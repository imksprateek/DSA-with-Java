package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class KthSmallestElementInABST_Leetcode230 {
    static int count = 0, val = 0;
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.right = new Node(2);

        System.out.println(kthSmallest(root, 2));
    }

    //Most optimal solution using two global int variables
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


    //Solution using Queue - Not the most optimal solution
    public int kthSmallest2(Node root, int k) {
        Queue<Integer> q = new LinkedList();
        inOrder(root, k, q);

        int val = 0;

        for(int i=0; i<k; i++){
            val = (int) q.poll();
        }

        return val;
    }

    public void inOrder2(Node node, int k, Queue<Integer> q){
        if(node==null){
            return;
        }
        inOrder2(node.left, k, q);
        q.add(node.value);
        inOrder2(node.right, k, q);
    }
}
