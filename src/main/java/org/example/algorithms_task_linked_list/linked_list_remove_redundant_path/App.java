package org.example.algorithms_task_linked_list.linked_list_remove_redundant_path;

public class App {
    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertFirst(3, 4);
        sll.insertFirst(3, 3);
        sll.insertFirst(3, 2);
        sll.insertFirst(2, 2);
        sll.insertFirst(1, 2);
        sll.insertFirst(0, 2);
        sll.insertFirst(0, 1);
        sll.insertFirst(0, 0);

        System.out.println("\nInitial");
        sll.print();

        sll.removeRedundantPath();
        System.out.println("\nAfter");
        sll.print();

    }
}
