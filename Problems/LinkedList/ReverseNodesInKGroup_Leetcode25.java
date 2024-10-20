package Problems.LinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

public class ReverseNodesInKGroup_Leetcode25 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);

        Node newHead = reverseKGroup(head, 2);
        printList(newHead);
    }

    public static Node reverseKGroup(Node head, int k) {
        if(head == null || head.next == null || k<=1){
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while(curr != null && canProceed(curr,k)){
            Node last = prev;
            Node newEnd = curr;

            for(int i=0; curr != null && i<k; i++){
                curr.next = prev;
                prev = curr;
                curr = next;

                if(next != null){
                    next = next.next;
                }
            }

            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = curr;
            prev = newEnd;
        }


        return head;
    }

    public static boolean canProceed(Node head, int k){
        if(head == null){
            return false;
        }
        int count = 0;
        Node temp = head;

        while(temp != null && count != k){
            temp = temp.next;
            count++;
        }

        if(count == k){
            return true;
        }else{
            return false;
        }
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
