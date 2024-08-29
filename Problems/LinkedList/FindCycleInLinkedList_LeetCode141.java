package Problems.LinkedList;
import java.util.LinkedList;

public class FindCycleInLinkedList_LeetCode141 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next;

        System.out.println("The number of cycles is " + hasCycle(head));
    }

    public static int hasCycle(ListNode head) {
        boolean  cycleFound = false;

        if(head == null){
            return 0;
        }
        if(head.next == null){
            return 0;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(fastPointer == slowPointer){
                cycleFound = true;
                break;
            }
        }

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


    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            this.val = x;
            this.next = null;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
