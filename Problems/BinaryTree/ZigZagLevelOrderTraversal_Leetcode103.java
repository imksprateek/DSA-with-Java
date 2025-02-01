package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ZigZagLevelOrderTraversal_Leetcode103 {
    public static void main(String[] args) {
        BinaryTree.Node root = new BinaryTree.Node(1);
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

        System.out.println(zigzagLevelOrder(root));
    }

    public static List<List<Integer>> zigzagLevelOrder(BinaryTree.Node root) {
        if(root == null){
            return new ArrayList<List<Integer>>();
        }
        int currentLevel = 0;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Deque<BinaryTree.Node> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            result.add(new ArrayList<Integer>());

            for(int i=0; i<levelSize; i++){
                BinaryTree.Node node = (currentLevel%2==0)? q.pollFirst():q.pollLast();
                if(node != null){
                    result.get(currentLevel).add(node.value);
                }

                if(currentLevel%2==0){
                    if(node.left != null){
                        q.add(node.left);
                    }
                    if(node.right != null){
                        q.add(node.right);
                    }
                }else{
                    if(node.right != null){
                        q.addFirst(node.right);
                    }
                    if(node.left != null){
                        q.addFirst(node.left);
                    }
                }
            }
            currentLevel++;
        }
        return result;
    }
}
