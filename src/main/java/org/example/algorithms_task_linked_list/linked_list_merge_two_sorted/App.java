package org.example.algorithms_task_linked_list.linked_list_merge_two_sorted;

public class App {
    public static void main(String[] args) {

        SinglyLinkedList sll1 = new SinglyLinkedList();

        sll1.insertFirst(10);
        sll1.insertFirst(8);
        sll1.insertFirst(7);
        sll1.insertFirst(4);

        SinglyLinkedList sll2 = new SinglyLinkedList();

        sll2.insertFirst(11);
        sll2.insertFirst(9);
        sll2.insertFirst(5);

        sll1.print();
        sll2.print();

        sll1.merge(sll2);

        System.out.println("\nAfter merging:");

        sll1.print();
    }
}
