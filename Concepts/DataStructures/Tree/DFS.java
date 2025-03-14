package Concepts.DataStructures.Tree;

public class DFS {
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

        
    }
}
