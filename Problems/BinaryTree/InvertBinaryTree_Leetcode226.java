package Problems.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree.Node;

public class InvertBinaryTree_Leetcode226 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);
        root.left.right = new BinaryTree.Node(5);
        root.left.left = new BinaryTree.Node(4);

        invertTree(root);
    }

    public static Node invertTree(Node root) {
        if(root==null){
            return null;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
