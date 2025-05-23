package org.example.algorithms_task_linked_list.linked_list_move_last_to_front;

public class App {

    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertFirst(7);
        sll.insertFirst(10);
        sll.insertFirst(3);
        sll.insertFirst(9);
        sll.insertFirst(1);

        System.out.println("\nInitial:");
        sll.print();

        sll.moveLastToFront1();
        // sll.moveLastToFront2();

        System.out.println("\nResult:");
        sll.print();
    }

}
