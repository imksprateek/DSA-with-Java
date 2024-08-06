package Concepts.DataStructures.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(9);
        list.insertAtIndex(4, 99);
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println("Deleted node: " + list.delete(1));
        list.printList();
        System.out.println(((list.find(2)>=0)?"Found at index: " + (list.find(2)):"not found"));
    }
}
