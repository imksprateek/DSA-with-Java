package Concepts.DataStructures.LinkedList.DoublyLinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.CustomLinkedList;

public class CustomDoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    void CustomLinkedList(){
        this.size = 0;
    }

    public void insertNode(int val){

    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
