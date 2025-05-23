package org.example.algorithms_task_linked_list.linked_list_intersection;

public class App {
    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        int intersection = sll.intersection();

        System.out.println("\nIntersection node has the value (-1 means no intersection): " + intersection);
    }
}
