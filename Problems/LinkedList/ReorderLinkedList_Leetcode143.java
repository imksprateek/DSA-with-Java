package Problems.LinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

public class ReorderLinkedList_Leetcode143 {
    public static void main(String[] args) {
        //Task is to reorder the linkedlist in this manner: L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …

        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);

        reorderList(head);

        printList(head);
    }

    public static void reorderList(Node head) {
        if(head == null || head.next == null){
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node afterMid = slow.next;
        slow.next = null;

        Node reverseHead = reverse(afterMid);

        Node newHead = new Node(-1);
        Node start = newHead;

        while(head != null && reverseHead != null){
            Node first = head.next;
            newHead.next = head;
            Node last = reverseHead.next;
            newHead.next.next = reverseHead;

            head = first;
            reverseHead = last;
            newHead = newHead.next.next;
        }

        if(head != null){
            newHead.next = head;
        }

        head = start.next;
    }

    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        return prev;
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
