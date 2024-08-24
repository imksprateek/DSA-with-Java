package Concepts.DataStructures.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomDoublyLinkedList list = new CustomDoublyLinkedList();

        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);

        list.insertFirst(15);
        list.insertLast(11);

        list.insertAtPosition(4, 99);
        list.insertAfter(14, 77);

        list.displayListForward();
        list.displayListBackward();
    }
}
