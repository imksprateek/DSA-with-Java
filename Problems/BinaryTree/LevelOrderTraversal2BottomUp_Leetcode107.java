package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Concepts.DataStructures.Tree.BinaryTree.Node;

public class LevelOrderTraversal2BottomUp_Leetcode107 {
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

        System.out.println(levelOrderBottom(root));
    }

    public static List<List<Integer>> levelOrderBottom(Node root) {
        if(root == null){
            return new ArrayList<List<Integer>>();
        }
        Queue<Node> q = new LinkedList();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        q.add(root);

        while(!q.isEmpty()){
            int levelSize = q.size();

            List<Integer> currentLevel = new ArrayList<Integer>();

            for(int i=0; i<levelSize; i++){
                Node node = q.poll();
                currentLevel.add(node.value);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }

            result.add(0, currentLevel);
        }

        return result;
    }
}
