package Problems.LinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

public class MiddleOfLinkedList_LeetCode876 {

    public static void main(String[] args) {
        Node head = new Node(5);

//        Regular approach
        System.out.println(middleNode(head));

//        Optimized approach using fast-slow pointer. This does the work only in one pass
        System.out.println(fastSlowPointer(head));;

    }

    public static Node middleNode(Node head) {
        int length = findLength(head);
        return getNode(length/2, head);
    }

    public static int findLength(Node head){
        Node temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        return length;
    }

    public static Node getNode(int pos, Node head){
        Node temp = head;

        while(pos > 0){
            temp = temp.next;
            pos--;
        }

        return temp;
    }


    public static Node fastSlowPointer(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
