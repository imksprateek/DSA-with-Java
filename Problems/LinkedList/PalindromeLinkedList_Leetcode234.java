package Problems.LinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList_Leetcode234 {
    public static void main(String[] args) {
        Node newHead = new Node(1);
        newHead.next = new Node(3);
        newHead.next.next = new Node(2);
        newHead.next.next.next = new Node(3);
        newHead.next.next.next.next = new Node(1);

        System.out.println(isPalindromeWithArr(newHead));

        System.out.println(isPalindromeUsingReversal(newHead));
    }


    public static boolean isPalindromeUsingReversal(Node head){
        if(head == null || head.next == null){
            return true;
        }

        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node afterMid = slow.next;
        slow.next = null;

        Node secondHalfEnd = reverse(afterMid);

        Node temp = head;
        while(secondHalfEnd != null){
            if(temp.value != secondHalfEnd.value){
                return false;
            }
            temp = temp.next;
            secondHalfEnd = secondHalfEnd.next;
        }

        return true;
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

    public static boolean isPalindromeWithArr(Node head) {
        if(head == null || head.next == null){
            return true;
        }
        List<Integer> arr = new ArrayList();

        Node temp = head;
        while(temp != null){
            arr.add(temp.value);
            temp = temp.next;
        }

        temp = head;
        for(int i=arr.size()-1; i>=0; i--){
            if(arr.get(i) != temp.value){
                return false;
            }
            temp = temp.next;
        }
        return true;
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
