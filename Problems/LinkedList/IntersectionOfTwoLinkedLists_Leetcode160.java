package Problems.LinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

public class IntersectionOfTwoLinkedLists_Leetcode160 {
    public static void main(String[] args) {
        Node newHead = new Node(1);
        newHead.next = new Node(2);
        newHead.next.next = new Node(3);
        newHead.next.next.next = new Node(4);
        newHead.next.next.next.next = new Node(5);

        Node anotherHead = new Node(6);
        anotherHead.next = new Node(7);
        anotherHead.next.next = newHead.next;

        System.out.println(getIntersectionNode(newHead, anotherHead).value);
    }

    public static Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null){
            return null;
        }

        int lenA = 0;
        int lenB = 0;

        Node tempA = headA, tempB = headB;

        while(tempA != null){
            lenA++;
            tempA = tempA.next;
        }

        while(tempB != null){
            lenB++;
            tempB = tempB.next;
        }

        if(lenA > lenB){
            for(int i=0; i<(lenA-lenB); i++){
                headA = headA.next;
            }
        }else if(lenB > lenA){
            for(int i=0; i<(lenB-lenA); i++){
                headB = headB.next;
            }
        }

        while(headA!=null || headB!=null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}
