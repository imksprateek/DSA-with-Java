package Problems.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Concepts.DataStructures.Tree.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree.Node;

public class BinaryTreeRightSIdeView_Leetcode199 {
    public static void main(String[] args) {
        Node root = new Node(1);
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

        System.out.println(rightSideView(root));;
    }


    public static List<Integer> rightSideView(Node root){
        //BFS approach
        if(root == null){
            return new ArrayList<Integer>();
        }

        List<Integer> result = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<Node>();

        q.offer(root);

        Node curr = root;
        while(!q.isEmpty()){
            int currLevel = q.size();

            for(int i=0; i<currLevel; i++){
                curr = q.poll();

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }

            result.add(curr.value);
        }

        return result;
    }
}
