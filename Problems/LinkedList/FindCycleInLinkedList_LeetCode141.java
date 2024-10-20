package Problems.LinkedList;
import java.util.LinkedList;

public class FindCycleInLinkedList_LeetCode141 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;

        System.out.println("The number of cycles is " + hasCycle(head));
    }

    public static int hasCycle(Node head) {
        boolean  cycleFound = false;

        if(head == null){
            return 0;
        }
        if(head.next == null){
            return 0;
        }

        Node slowPointer = head;
        Node fastPointer = head;

        //Find if a cycle exists
        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(fastPointer == slowPointer){
                cycleFound = true;
                break;
            }
        }

        //Calculate the length of cycle if found
        if(cycleFound){
            int cycleCount = 0;
            do{
                slowPointer = slowPointer.next;
                cycleCount++;
            }while(slowPointer != fastPointer);
            return cycleCount;
        }

        return 0;
    }


    public static class Node {
        public int val;
        public Node next;

        public Node(int x) {
            this.val = x;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
