package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsInABinaryTree_Leetcode993 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);
        root.left.right = new BinaryTree.Node(4);
        root.right.right = new BinaryTree.Node(5);

        System.out.println(isCousins(root, 5, 4));
    }

    public static boolean isCousins(Node root, int x, int y) {
        Queue<Node> q = new LinkedList<Node>();

        q.offer(root);
        while(!q.isEmpty()){
            int currLevel = q.size();
            boolean firstFound = false;
            boolean secondFound = false;

            for(int i=0; i<currLevel; i++){
                Node curr = q.poll();

                if(curr.left != null && curr.right != null){
                    if((curr.left.value == x && curr.right.value == y) || (curr.right.value == x && curr.left.value == y)){
                        return false;
                    }
                }

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }

                if(curr.value == x){
                    firstFound = true;
                }
                if(curr.value == y){
                    secondFound = true;
                }
            }
            if(firstFound && secondFound){
                return true;
            }
        }
        return false;
    }
}
