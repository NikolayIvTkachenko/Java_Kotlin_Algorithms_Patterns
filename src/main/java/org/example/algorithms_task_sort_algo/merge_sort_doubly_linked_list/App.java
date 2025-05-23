package org.example.algorithms_task_sort_algo.merge_sort_doubly_linked_list;

public class App {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertFirst(2);
        dll.insertFirst(12);
        dll.insertFirst(9);
        dll.insertFirst(10);
        dll.insertFirst(-9);
        dll.insertFirst(56);
        dll.insertFirst(1);
        dll.insertFirst(-2);
        dll.insertFirst(10);
        dll.insertFirst(0);
        dll.insertFirst(10);

        System.out.println("Initial list:");
        dll.print();

        dll.sort();

        System.out.println("\nSorted list:");
        dll.print();
    }

}
