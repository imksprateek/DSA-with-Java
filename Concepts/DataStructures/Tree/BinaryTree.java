package Concepts.DataStructures.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class BinaryTree {

    private Node root;

    public BinaryTree(){

    }

    public BinaryTree(Node node){
        this.root = node;
    }

    //Insert elements:
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node value: ");
        int value = scanner.nextInt();

        root = new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter Left of " + node.value);
        boolean left = scanner.nextBoolean();

        if(left){
            System.out.println("Enter the Left child of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter Right of " + node.value);
        boolean right = scanner.nextBoolean();

        if(right){
            System.out.println("Enter the Right child of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }
        prettyDisplay(node.right, level+1);
        if(level != 0){
            for(int i=0; i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----> " + node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level+1);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + ", ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + ", ");
    }

    public ArrayList<ArrayList<Integer>> bfsUsingArrayList(){
        return bfsUsingArrayList(root, 0, new ArrayList<ArrayList<Integer>>());
    }

    public void bfsUsingQueue(){
        bfsUsingQueue(root);
    }

    private ArrayList<ArrayList<Integer>> bfsUsingArrayList(Node node, int level, ArrayList<ArrayList<Integer>> result){
        if(node == null){
            return new ArrayList<ArrayList<Integer>>();
        }

        if(result.size() <= level){
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.value);

        bfsUsingArrayList(node.left, level+1, result);
        bfsUsingArrayList(node.right, level+1, result);
        return result;
    }

    public void bfsUsingQueue(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll(); // Remove front node
                System.out.print(current.value + "\t");

                // Add children to the queue
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            System.out.println();
        }

        /*
                queue.poll():
                Returns: The head of the queue, or null if the queue is empty.
                Exception: Does not throw an exception if the queue is empty.
                queue.remove():
                Returns: The head of the queue.
                Exception: Throws a NoSuchElementException if the queue is empty.
                 */
    }


    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }
    }
}
