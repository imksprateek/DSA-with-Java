package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderSuccessorOfANode {
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

        System.out.println(findSuccessorUsingBFS(root, 6));
        System.out.println(findSuccessorUsingBFS(root, 7));
    }

    public static int findSuccessorUsingBFS(BinaryTree.Node root, int key) {
        Queue<BinaryTree.Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            BinaryTree.Node current = q.poll();
            if(current.left != null){
                q.add(current.left);
            }
            if(current.right != null){
                q.add(current.right);
            }

            if(current.value == key){
                break;
            }
        }
        return q.peek().value;
    }
}
