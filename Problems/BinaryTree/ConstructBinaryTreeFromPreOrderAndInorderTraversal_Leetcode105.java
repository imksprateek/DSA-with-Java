package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree.Node;

import java.util.Arrays;

public class ConstructBinaryTreeFromPreOrderAndInorderTraversal_Leetcode105 {
    public static void main(String[] args) {
        Node root = buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});

        System.out.println(root.value);
        System.out.println(root.left.value);
        System.out.println(root.right.value);
    }

    public static Node buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        int current = preorder[0];
        int index = 0;

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == current) {
                index = i;
                break;
            }
        }

        Node node = new Node(current);
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));

        return node;
    }
}
