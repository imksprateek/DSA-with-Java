package Problems.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree.Node;

public class MaximumDepthOfBinaryTree_Leetcode104 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);
        root.left.right = new BinaryTree.Node(5);
        root.left.left = new BinaryTree.Node(4);

        System.out.println(getHeight(root, 0));
    }

    public static int getHeight(Node node, int height){
        if(node == null){
            return height;
        }

        int leftHeight = getHeight(node.left, height+1);
        int rightHeight = rightHeight = getHeight(node.right, height+1);

        return Math.max(leftHeight, rightHeight);
    }
}
