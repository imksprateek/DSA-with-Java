package Concepts.DataStructures.Tree;

public class BinarySearchTree {
    private Node root;
    private Node left;
    private Node right;

    public BinarySearchTree(){
        
    }

    public int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
    }

    public void populate(int[] values){
        for(int value : values){
            insert(value);
        }
    }

    public void populateSorted(int[] values){
        populateSorted(values, 0, values.length);
    }

    private void populateSorted(int[] values, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start + end) / 2;
        insert(values[mid]);
        populateSorted(values, start, mid);
        populateSorted(values, mid + 1, end);
    }

    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }else{
            node.right = insert(value, node.right);
        }
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return node;
    }

    public boolean isBalanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
}
