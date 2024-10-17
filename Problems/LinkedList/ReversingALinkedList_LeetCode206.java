package Problems.LinkedList;
import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

public class ReversingALinkedList_LeetCode206 {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(6);
        printList(head);

        Node reversedHeadItr = reverseListIteration(head);
        printList(reversedHeadItr);


        Node newHead = new Node(1);
        newHead.next = new Node(2);
        newHead.next.next = new Node(3);
        newHead.next.next.next = new Node(4);
        newHead.next.next.next.next = new Node(5);
        newHead.next.next.next.next.next = new Node(6);
        Node reversedHeadRec = reverseListRecursion(newHead);
        printList(reversedHeadRec);
    }

    public static Node reverseListIteration(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node temp = head;

        while(temp != null){
            Node front = temp.next;
            temp.next = prev;

            prev = temp;
            temp = front;
        }

        return prev;
    }

    public static Node reverseListRecursion(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node temp = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;

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
