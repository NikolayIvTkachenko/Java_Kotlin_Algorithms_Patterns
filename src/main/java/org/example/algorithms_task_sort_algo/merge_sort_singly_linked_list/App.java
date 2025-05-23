package org.example.algorithms_task_sort_algo.merge_sort_singly_linked_list;

public class App {
    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertFirst(2);
        sll.insertFirst(12);
        sll.insertFirst(9);
        sll.insertFirst(10);
        sll.insertFirst(-9);
        sll.insertFirst(56);
        sll.insertFirst(1);
        sll.insertFirst(-2);
        sll.insertFirst(10);
        sll.insertFirst(0);
        sll.insertFirst(10);

        System.out.println("Initial list:");
        sll.print();

        sll.sort();

        System.out.println("\nSorted list:");
        sll.print();
    }
}
