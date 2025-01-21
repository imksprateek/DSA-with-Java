package Concepts.DataStructures.Tree;

public class AvlTree {
    private Node root;
    private Node left;
    private Node right;

    public AvlTree(){

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
        return rotate(node);
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

    private Node rotate(Node node){
        if(getHeight(node.left) - getHeight(node.right) > 1){
            //This means the tree is left heavy.
            //Left heavy has 2 cases: left-left and left-right

            if(getHeight(node.left.left) - getHeight(node.left.right) > 0){
                //This means the tree is left-left case
                //Perform right rotation
                return rightRotate(node);
            }
            if(getHeight(node.left.left) - getHeight(node.left.right) < 0){
                //This means the tree is left-right case
                //Perform left rotation
                node.left = leftRotate(node.left);
                //Perform right rotation
                return rightRotate(node);
            }
        }

        if(getHeight(node.left) - getHeight(node.right) < -1){
            //This means the tree is right heavy.
            //Left heavy has 2 cases: right-right and right-left

            if(getHeight(node.right.left) - getHeight(node.right.right) < 0){
                //This means the tree is right-right case
                //Perform left rotation
                return leftRotate(node);
            }
            if(getHeight(node.right.left) - getHeight(node.right.right) > 0){
                //This means the tree is right-left case
                //Perform right rotation
                node.right = rightRotate(node.right);
                //perform left rotation
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;

        return c;
    }

    public Node leftRotate(Node p){
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;

        return c;
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
