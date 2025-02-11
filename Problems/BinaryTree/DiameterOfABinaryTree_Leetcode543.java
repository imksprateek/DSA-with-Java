package Problems.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree.Node;

public class DiameterOfABinaryTree_Leetcode543 {
    static int diameter = 0;

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);
        root.left.right = new BinaryTree.Node(5);
        root.left.left = new BinaryTree.Node(4);

        System.out.println(diameterOfBinaryTree(root));
    }

    public static int diameterOfBinaryTree(Node root) {
        getHeight(root);

        //diameter - 1 because we want the number of edges and not nodes
        return diameter - 1;
    }

    public static int getHeight(Node node){
        if(node == null){
            return 0;
        }
        int left = getHeight(node.left);
        int right = getHeight(node.right);

        // +1 to include the current node
        int diam = left + right + 1;

        diameter = Math.max(diam, diameter);

        //bottom level is considered as height 1 and not 0 so +1
        return Math.max(left, right) + 1;
    }
}
