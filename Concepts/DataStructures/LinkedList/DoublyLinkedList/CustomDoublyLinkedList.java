package Concepts.DataStructures.LinkedList.DoublyLinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.CustomLinkedList;

public class CustomDoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    void CustomLinkedList(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;

        if(tail == null){
            tail = newNode;
        }

        if(head != null){
            head.prev = newNode;
        }
        head = newNode;

        size++;
    }

    public void insertLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }

        if(tail != null){
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;

        size++;
    }

    public void insertAtPosition(int pos, int val){

        if(pos < 0 || pos > size){
            System.out.println("Invalid position");
        }else if(pos == 0){
            insertFirst(val);
        }else if(pos == size){
            System.out.println("size is + " + size);
            insertLast(val);
        }else {
            Node newNode = head;
            for (int i = 1; i < pos; i++) {
                newNode = newNode.next;
            }
            Node tempNode = new Node(val);
            if(newNode.next != null){
                newNode.next.prev = tempNode;
            }
            tempNode.next = newNode.next;
            newNode.next = tempNode;
            tempNode.prev = newNode;
            size++;
        }
    }

    public void insertAfter(int target, int val){
        Node node = head;

        while(node.value != target){
            node = node.next;
            if(node == null){
                System.out.println("Target element not found");
                return;
            }
        }

        Node tempNode = new Node(val);
        tempNode.next = node.next;
        node.next.prev = tempNode;
        node.next = tempNode;
        tempNode.prev = node;

        size++;
    }

    public void displayListForward(){
        System.out.println("Printing in forward direction....");
        Node current = head;
        System.out.print("START -> ");
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.print(" END ");
        System.out.println();
    }

    public void displayListBackward(){
        System.out.println("Printing in backward direction....");
        Node current = tail;
        System.out.print(" END <- ");
        while(current != null){
            System.out.print(current.value + " <- ");
            current = current.prev;
        }
        System.out.print(" START ");
        System.out.println();
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
