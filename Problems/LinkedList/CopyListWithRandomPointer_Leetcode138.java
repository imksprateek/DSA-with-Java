package Problems.LinkedList;

import Concepts.DataStructures.LinkedList.SinglyLinkedList.Node;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer_Leetcode138 {
    public static void main(String[] args) {
        Node newHead = new Node(1);
        newHead.next = new Node(3);
        newHead.next.next = new Node(2);
        newHead.next.next.next = new Node(3);
        newHead.next.next.next.next = new Node(1);

        newHead.random = null;
        newHead.next.random = newHead.next.next.next;
        newHead.next.next.next.random = newHead.next.next;
        newHead.next.next.random = newHead;
        newHead.next.next.next.next.random = newHead.next;

        Node copy = copyRandomList(newHead);

        while(copy != null){
            System.out.print("Val: " + copy.value);
            if(copy.next != null){
                System.out.print(", next: " + copy.next.value);
            }else{
                System.out.print(", next: " + "null");
            }
            if(copy.random != null){
                System.out.println(", random: " + copy.random.value);
            }else{
                System.out.println(", random: " + "null");
            }
            System.out.println();
            copy = copy.next;
        }
    }

    public static Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();

        Node temp = head;

        while(temp != null){
            map.put(temp, new Node(temp.value));
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            Node curr = map.get(temp);
            curr.next = map.get(temp.next);
            curr.random = map.get(temp.random);
            temp = temp.next;
        }

        return map.get(head);
    }

    public static class Node{
        public int value;
        public Node next;
        public Node random;

        public Node(int value, Node next, Node random) {
            this.value = value;
            this.next = next;
            this.random = random;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
