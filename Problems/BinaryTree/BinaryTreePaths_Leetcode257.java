package Problems.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import Concepts.DataStructures.Tree.BinaryTree.Node;

public class BinaryTreePaths_Leetcode257 {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.right = new Node(2);

        System.out.println(binaryTreePaths(root));
    }

    public static List<String> binaryTreePaths(Node root) {
        return binaryTreePathsHelper(root, "");
    }

    private static List<String> binaryTreePathsHelper(Node node, String path){
        List<String> result = new ArrayList<String>();
        if(node == null){
            return result;
        }

        if(node.left == null && node.right == null){
            path = path.concat(node.value + "");
            result.add(path);
            return result;
        }

        path = path.concat(node.value + "->");

        result.addAll(binaryTreePathsHelper(node.left, path));
        result.addAll(binaryTreePathsHelper(node.right, path));

        return result;
    }
}
