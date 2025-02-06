package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree;

import java.util.ArrayDeque;
import java.util.Deque;

public class PopulatingNextRightPointersInEachNode_Leetcode116 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(connectWithoutQueue(root));
        printConnection(root);

        System.out.println("\n\n");
        System.out.println(connectUsingQueue(root));
        printConnection(root);
    }

    public static Node connectWithoutQueue(Node root){
        //Best approach
            if(root==null){
                return null;
            }

            Node curr = root;
            Node leftMost = curr;

            while(leftMost.left != null){
                curr.left.next = curr.right;

                if(curr.next != null){
                    curr.right.next = curr.next.left;
                    curr = curr.next;
                }else{
                    leftMost = leftMost.left;
                    curr = leftMost;
                }
            }

            return root;
    }

    public static Node connectUsingQueue(Node root){
        //Not the best approach
        if(root==null){
            return null;
        }
        Deque<Node> q = new ArrayDeque();
        q.add(root);

        while(!q.isEmpty()){
            int currentLevel = q.size();
            Node prev = null;

            for(int i=0; i<currentLevel; i++){
                Node node = q.poll();

                if(prev != null){
                    prev.next = node;
                }

                prev = node;

                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            prev.next = null;
        }

        return root;
    }


    public static void printConnection(Node root){
        Node curr = root;
        Node leftMost = curr;

        while(leftMost!=null){
            if(curr != null){
                System.out.print(curr.value + " -> ");
                curr = curr.next;
            }else{
                System.out.println();
                curr = leftMost.left;
                leftMost = leftMost.left;
            }
        }
    }

    private static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node next;
        public Node(int value){
            this.value = value;
        }
    }

}
