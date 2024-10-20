package Problems.LinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

public class RotateALinkedList_Leetcode61 {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);

        Node newHead = rotateRight(head, 2);
        printList(newHead);
    }

    public static Node rotateRight(Node head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        int len = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }

        for(int i=0; i<k%len; i++){
            Node lastButOne = getLastButOne(head);
            Node last = lastButOne.next;
            lastButOne.next = null;
            last.next = head;
            head = last;
        }

        return head;
    }

    public static Node getLastButOne(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node temp = head;

        while(temp.next != null && temp.next.next != null){
            temp = temp.next;
        }

        return temp;
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.print("null ");
        System.out.println();
    }
}
