package Problems.LinkedList;
import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

public class ReversingALinkedListBetweenIndices_LeetCode92 {
    public static void main(String[] args) {
        Node newHead = new Node(1);
        newHead.next = new Node(2);
        newHead.next.next = new Node(3);
        newHead.next.next.next = new Node(4);
        newHead.next.next.next.next = new Node(5);
        newHead.next.next.next.next.next = new Node(6);

        Node head = reverseBetween(newHead, 2,4);
        printList(head);
    }

    public static Node reverseBetween(Node head, int left, int right) {
        if(head == null || head.next == null || left == right){
            return head;
        }

        Node current = head;
        Node prev = null;

        for(int i=0; current != null && i<left-1; i++){
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;

        Node next = current.next;
        for(int i=0; current!= null && i < right-left+1; i++){
            current.next = prev;
            prev = current;
            current = next;

            if(next!=null){
                next = next.next;
            }
        }

        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;

        return head;
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
