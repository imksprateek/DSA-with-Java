package Problems.LinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

public class AddTwoNumbers_Leetcode2 {
    public static void main(String[] args) {
        //number 1 in reverse order of digits
        Node newHead = new Node(9);
        newHead.next = new Node(9);
        newHead.next.next = new Node(9);

        //number 2 in reverse order of digits
        Node anotherHead = new Node(6);
        anotherHead.next = new Node(7);

        Node result = addTwoNumbers(newHead, anotherHead);
        while(result != null){
            System.out.print(result.value + " -> ");
            result = result.next;
        }
        System.out.println();
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        Node result = new Node(-1);
        Node temp = result;

        int carry = 0;

        while(l1 != null && l2 != null){
            int sum = l1.value + l2.value + carry;
            carry = sum / 10;

            temp.next = new Node(sum % 10);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int sum = l1.value + carry;
            carry = sum / 10;

            temp.next = new Node(sum % 10);
            temp = temp.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int sum = l2.value + carry;
            carry = sum / 10;

            temp.next = new Node(sum % 10);
            temp = temp.next;
            l2 = l2.next;
        }

        if(carry > 0){
            temp.next = new Node(carry);
        }

        return result.next;
    }
}
