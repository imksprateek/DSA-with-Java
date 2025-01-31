package Problems.BinaryTree;

import Concepts.DataStructures.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInaBT_Leetcode637 {
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

        System.out.println(averageOfLevels(root));
    }

    public static List<Double> averageOfLevels(BinaryTree.Node root) {
        Queue<BinaryTree.Node> q = new LinkedList<>();
        List<Double> avgList = new ArrayList<>();

        q.add(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            double avg = 0;
            for(int i=0; i<levelSize; i++){
                BinaryTree.Node current = q.poll();
                avg+=current.value;
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }
            avg = avg/levelSize;
            avgList.add(avg);
        }

        return avgList;
    }
}
