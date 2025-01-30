package Concepts.DataStructures.Tree;

public class SegmentTree {
    public Node root;

    public SegmentTree(int[] arr){
        root = construct(arr, 0, arr.length - 1);
    }

    private Node construct(int[] arr, int start, int end){
        if(start == end){
            //Leaf node
            return new Node(start, end, arr[start]);
        }
        //Create new node for the index we are currently at
        Node node = new Node(start, end);
        int mid = (start + end) / 2;
        node.left = construct(arr, start, mid);
        node.right = construct(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(){
        displayTree(root, "Root Node: ");
    }

    private void displayTree(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.data);
        displayTree(node.left, "Left child of " + node.data + ": ");
        displayTree(node.right, "Right child of " + node.data + ": ");
    }

    public int query(int start, int end){
        return query(root, start, end);
    }

    private int query(Node node, int start, int end){
        if(node.startInterval >= start && node.endInterval <= end){
            return node.data;
        }
        if(node.startInterval > end || node.endInterval < start){
            return 0;
        }
        return query(node.left, start, end) + query(node.right, start, end);
    }

    public void update(int index, int value){
        this.root.data = update(root, index, value);
    }

    private int update(Node root, int index, int value){
        if(index >= root.startInterval && index <= root.endInterval){
            if(root.startInterval == index && root.startInterval == root.endInterval){
                root.data = value;
                return root.data;
            }else {
                root.data = update(root.left, index, value) + update(root.right, index, value);
            }
        }
        return root.data;
    }

    private class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
        public Node(int startInterval, int endInterval, int data){
            this.data = data;
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
}
