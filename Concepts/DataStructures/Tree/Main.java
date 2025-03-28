package Concepts.DataStructures.Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.populate(new Scanner(System.in));
        tree.preOrderIterativeDFS();


//        System.out.println("----------BINARY SEARCH TREE----------");
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.populate(new int[]{5, 3, 7, 2, 4, 6, 8});
//        //polulateSorted function makes sure the tree is not skewed
//        bst.populateSorted(new int[]{9,10,11,12,13,14,15});
//        bst.display();


        /*
        Binary Tree Traversals:
        - Preorder: Root, Left, Right
        - Inorder: Left, Root, Right
        - Postorder: Left, Right, Root

        Usages:
        - Preorder: Used to create a copy of the tree.
        - Inorder: Used to get elements of a Binary Search Tree in increasing order.
        - Postorder: Used to delete any node from the Tree and performing any bottom=up calculation like calculating the height. Takes care of children before deleting the parent node.
         */

//        System.out.println("----------AVL TREE----------");
//        AvlTree avl = new AvlTree();
//
//        avl.insert(1);
//        avl.insert(2);
//        avl.insert(3);
//        avl.insert(4);
//        avl.insert(5);
//        avl.insert(6);
//
//        avl.display();
//        //Observation- AVL Tree is not skewed when inserted in ascending order
//
//        System.out.println("----------SEGMENT TREE----------");
//        int[] arr = {3,8,7,6,-2,-8,4,9};
//        SegmentTree segmentTree = new SegmentTree(arr);
//        segmentTree.display();
//        System.out.println("------QUERIES------");
//        System.out.println(segmentTree.query(2,6));
//        System.out.println("------UPDATING VALUE------");
//        segmentTree.update(3,5);
//        segmentTree.display();
    }
}
