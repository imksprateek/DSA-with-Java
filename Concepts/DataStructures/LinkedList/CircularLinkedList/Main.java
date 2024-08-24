package Concepts.DataStructures.LinkedList.CircularLinkedList;

public class Main {

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.delete(5);

        list.displayList();
    }


}
