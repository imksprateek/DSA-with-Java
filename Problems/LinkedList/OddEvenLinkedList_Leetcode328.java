package Problems.LinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

public class OddEvenLinkedList_Leetcode328 {
    public static void main(String[] args) {
        Node newHead = new Node(1);
        newHead.next = new Node(2);
        newHead.next.next = new Node(3);
        newHead.next.next.next = new Node(4);
        newHead.next.next.next.next = new Node(5);

        Node result = oddEvenList(newHead);

        while(result != null){
            System.out.print(result.value + " -> ");
            result = result.next;
        }
        System.out.println();
    }

    public static Node oddEvenList(Node head) {
        Node oddHead = new Node(0);
        Node evenHead = new Node(0);


        Node oddPtr = oddHead;
        Node evenPtr = evenHead;

        int pos = 1;
        while(head!= null){
            Node temp = head.next;
            head.next = null;
            if(pos%2 == 0){
                evenPtr.next = head;
                evenPtr = evenPtr.next;
            }else{
                oddPtr.next = head;
                oddPtr = oddPtr.next;
            }
            head = temp;
            pos++;
        }

        if(oddPtr != null){
            oddPtr.next = evenHead.next;
        }

        head = oddHead.next;
        return head;
    }
}
