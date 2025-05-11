package Problems.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree.Node;

import java.util.*;

public class VerticalOrderTraversalOfABinaryTree_Leetcode987 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);
        root.left.right = new BinaryTree.Node(5);
        root.left.left = new BinaryTree.Node(4);

        System.out.println(verticalTraversal(root));
    }

    public static List<List<Integer>> verticalTraversal(Node root) {
        PriorityQueue<NodeEntry> pq = new PriorityQueue<>(
                (a,b) -> {
                    if(a.col != b.col) return Integer.compare(a.col, b.col);
                    if(a.row != b.row) return Integer.compare(a.row, b.row);
                    return Integer.compare(a.node.value, b.node.value);
                }
        );

        Queue<NodeEntry> q = new LinkedList<>();

        q.offer(new NodeEntry(0, 0, root));

        while(!q.isEmpty()){
            NodeEntry curr = q.poll();
            pq.offer(curr);

            if(curr.node.left != null){
                q.offer(new NodeEntry(curr.row+1, curr.col-1, curr.node.left));
            }
            if(curr.node.right != null){
                q.offer(new NodeEntry(curr.row+1, curr.col+1, curr.node.right));
            }
        }

        Map<Integer, List<Integer>> colMap = new TreeMap<>();
        while (!pq.isEmpty()) {
            NodeEntry e = pq.poll();
            colMap.putIfAbsent(e.col, new ArrayList<>());
            colMap.get(e.col).add(e.node.value);
        }
        return colMap.values().stream().toList();
    }

    public static class NodeEntry{
        Node node;
        int row;
        int col;

        public NodeEntry(int row, int col, Node node){
            this.row = row;
            this.col = col;
            this.node = node;
        }
    }
}
