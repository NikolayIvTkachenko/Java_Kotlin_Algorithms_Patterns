package org.example.algorithms_task_linked_list.linked_list_palidrome;

public class App {
    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertFirst(11);
        sll.insertFirst(10);
        sll.insertFirst(9);
        sll.insertFirst(8);
        sll.insertFirst(9);
        sll.insertFirst(10);
        sll.insertFirst(11);

        sll.print();

        boolean result = sll.isPalindrome();

        System.out.println("\nIs it palindrome? " + result);
    }
}
