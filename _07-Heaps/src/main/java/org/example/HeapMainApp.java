package org.example;

public class HeapMainApp {
    public static void main(String[] args) {
        MyHeap heap = new MyHeap(8);
        heap.insert(61);
        heap.insert(5);
        heap.insert(32);
        heap.insert(12);
        heap.insert(52);
        heap.insert(45);
        heap.insert(83);
        heap.printHeap();

        System.out.println("\n" + heap.remove() + " is removed and size is: " + heap.size);
        heap.printHeap();
    }
}
