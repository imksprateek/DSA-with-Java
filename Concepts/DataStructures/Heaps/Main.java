package Concepts.DataStructures.Heaps;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(10);
        heap.insert(5);
        heap.insert(15);
        heap.insert(2);
        heap.printHeap(); // Should be min-heap ordered

        System.out.println("Roved element: " + heap.remove()); // Should be 2
        heap.printHeap();
        System.out.println(heap.heapSort());
    }
}
