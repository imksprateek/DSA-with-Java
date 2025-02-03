package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import Concepts.DataStructures.Tree.BinaryTree.Node;

public class LevelOrderTraversal1_Leetcode102 {
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

        System.out.println(levelOrder(root));
    }

    public static List<List<Integer>> levelOrder(Node root) {
        return traverse(root,0, new ArrayList<List<Integer>>());
    }

    private static List<List<Integer>> traverse(Node node, int level, List<List<Integer>> result){
        if(node == null){
            return new ArrayList<List<Integer>>();
        }
        if(result.size() <= level){
            result.add(new ArrayList<Integer>());
        }

        result.get(level).add(node.value);

        traverse(node.left, level+1, result);
        traverse(node.right, level+1, result);

        return result;
    }
}
