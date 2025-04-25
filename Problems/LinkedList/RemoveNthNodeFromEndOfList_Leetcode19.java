package Problems.LinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

public class RemoveNthNodeFromEndOfList_Leetcode19 {
    public static void main(String[] args) {
        Node newHead = new Node(1);
        newHead.next = new Node(2);
        newHead.next.next = new Node(3);
        newHead.next.next.next = new Node(4);
        newHead.next.next.next.next = new Node(5);

        Node result = removeNthFromEnd(newHead, 2);

        while(result != null){
            System.out.print(result.value + " -> ");
            result = result.next;
        }
        System.out.println();
    }

    public static Node removeNthFromEnd(Node head, int n) {
        if(n==0){
            return head;
        }

        if(head.next == null){
            return null;
        }

        int len = 0;
        Node temp = head;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        if(len == n){
            head = head.next;
            return head;
        }

        temp = head;
        for(int i=0; i<(len-n-1); i++){
            temp = temp.next;
        }

        if(temp != null && temp.next != null){
            temp.next = temp.next.next;
        }else{
            temp.next = null;
        }

        return head;
    }
}
