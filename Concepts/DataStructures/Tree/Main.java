package Concepts.DataStructures.Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.populate(new Scanner(System.in));
        tree.display();
        tree.prettyDisplay();
    }
}
