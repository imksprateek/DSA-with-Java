package Concepts.DataStructures.LinkedList.CircularLinkedList;

public class CircularLinkedList {
    Node head;
    Node tail;
    int size;

    public CircularLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node Node = new Node(val);
        if(head == null){
            head = Node;
            tail = Node;
            size++;
            return;
        }
        tail.next = Node;
        Node.next = head;
        tail = Node;
        size++;
    }

    public void delete(int val) {
        Node node = head;
        if(node == null){
            System.out.println("List is empty");
            return;
        }else if(node.val == val){
            head = head.next;
            tail.next = head;
            size--;
            return;
        }else{
            do{
                Node n = node.next;
                if(n.val == val){
                    node.next = n.next;
                    size--;
                    return;
                }
                node = node.next;
            }while(node != head);
            System.out.println("Node not found in the List");
        }

    }

    public void displayList(){
        Node temp = head;
        if(head!=null){
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println();
        System.out.println("Size of the List: " + size);
    }


    public class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
