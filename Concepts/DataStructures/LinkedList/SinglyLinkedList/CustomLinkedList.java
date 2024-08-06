package Concepts.DataStructures.LinkedList.SinglyLinkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void insertAtIndex(int index, int val){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Index out of bounds");
        }
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size-1){
            insertLast(val);
            return;
        }
        Node temp = get(index-1);
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size+=1;
    }

    public int deleteFirst(){
        int val;
        if(head == null){
            throw new IllegalArgumentException("List is empty");
        }
        val = head.value;
        if(head.next == null){
            head = null;
            tail = null;
            return val;
        }
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size == 1){
            return deleteFirst();
        }
        if(tail == null){
            throw new IllegalArgumentException("List is empty");
        }
        int i = 0;
        Node secondLast = get(size - 2);
        int val = secondLast.next.value;
        tail = secondLast;
        secondLast.next = null;
        size--;
        return val;
    }

    public int find(int val){
        if(size == 0){
            return -1;
        }
        Node temp = head;
        for(int i = 0; i < size; i++){
            if(temp.value == val){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int delete(int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Index out of bounds");
        }
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node previous = get(index-1);
        int deletedValue = previous.next.value;
        previous.next = previous.next.next;
        size--;
        return deletedValue;
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.print("END");
        System.out.println();
        System.out.println("Size of the list: " + size);
    }

    public Node get(int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Index out of bounds");
        }
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
