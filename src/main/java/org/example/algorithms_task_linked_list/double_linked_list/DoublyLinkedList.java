package org.example.algorithms_task_linked_list.double_linked_list;

public class DoublyLinkedList {
    // this is a single node of a doubly linked list
    private final class Node {

        private int data;  // the information
        private Node next; // pointer to the next node
        private Node prev; // pointer to the previous node

        @Override
        public String toString() {
            return " " + data + " ";
        }
    }

    private Node head; // left-hand head of the linked list
    private Node tail; // right-hand head of the linked list
    private int size;  // size of the linked list (number of nodes)

    // if head is null then the linked list is empty
    public boolean isEmpty() {
        return (head == null);
    }

    // insert a node at the start of linked list
    public void insertFirst(int data) {

        // create a new node
        Node newNode = new Node();

        // set the data of the new node
        newNode.data = data;

        // link the new node to the list as the first node
        newNode.next = head;

        // if there is a head then link it to the new node
        if (head != null) {
            head.prev = newNode;
        }

        // this new node become the head
        head = newNode;

        // if this is the first node then it is the tail as well
        if (tail == null) {
            tail = newNode;
        }

        // set the new size
        size++;
    }

    // insert a node at the end of linked list
    public void insertLast(int data) {

        // create new node
        Node newNode = new Node();

        // set the data of the new node
        newNode.data = data;

        // link the new node to the list as the last node
        // if there is a tail then point to the newNode
        if (tail != null) {
            tail.next = newNode;
            newNode.prev = tail;
        }

        tail = newNode;

        if (head == null) {
            head = newNode;
        }

        // set the new size
        size++;
    }

    // insert at a certain index
    public void insertAt(int index, int data) {

        // store head node
        Node currentNode = head;

        // if index is 0 then head node itself is to be inserted
        if (index == 0 && currentNode != null) {
            insertFirst(data);
            return;
        }

        // if index = size then last node itself is to be inserted
        if (index == size && currentNode != null) {
            insertLast(data);
            return;
        }

        // index cannot be larger than size
        if (index > size) {
            throw new RuntimeException("Index is larger than size!");
        }

        // if the index > 0 and index <= size
        int pointer = 0;
        while (currentNode != null) {

            if (pointer == index) {
                // create a new node
                Node newNode = new Node();

                // set the data of the new node
                newNode.data = data;

                // link the new node to the previous node
                currentNode.prev.next = newNode;
                newNode.prev = currentNode.prev;

                // link the new node to the next node
                newNode.next = currentNode;
                currentNode.prev = newNode;

                // set the new size
                size++;

                return;
            } else {
                // continue searching to next node
                currentNode = currentNode.next;

                pointer++;
            }
        }
    }

    // delete node by data
    public boolean delete(int data) {

        // store head node
        Node currentNode = head;

        // check if data belongs to the head
        if (currentNode != null && currentNode.data == data) {

            head = currentNode.next;

            // manage the head and the tail
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }

            // set the new size
            size--;

            return true;
        }

        // check if the data is somewhere other than at head
        while (currentNode != null && currentNode.data != data) {

            // go to the next node
            currentNode = currentNode.next;
        }

        // if the data was present, it should be at currentNode
        if (currentNode != null) {
            if (currentNode != tail) {

                // unlink currentNode from previous node
                currentNode.prev.next = currentNode.next;

                // unlink currentNode from next node
                currentNode.next.prev = currentNode.prev;
            } else {
                // unlink the tail
                tail = currentNode.prev;

                // manage the head and the tail
                if (tail != null) {
                    tail.next = null;
                } else {
                    head = null;
                }
            }

            // set the new size
            size--;

            return true;

        }

        // we cannot find the given data
        return false;
    }

    // delete node by index (position)
    public boolean deleteByIndex(int index) {

        // store head node
        Node currentNode = head;

        // if index is 0 then head node itself is to be deleted
        if (index == 0 && currentNode != null) {
            head = currentNode.next;

            // manage the head and the tail
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }

            // set the new size
            size--;

            return true;
        }

        // if the index > 0
        int pointer = 0;
        while (currentNode != null) {

            if (pointer == index) {
                if (pointer < (size - 1)) {

                    // unlink currentNode from previous node
                    currentNode.prev.next = currentNode.next;

                    // unlink currentNode from next node
                    currentNode.next.prev = currentNode.prev;
                } else {
                    // unlink the tail
                    tail = currentNode.prev;

                    // manage the head and the tail
                    if (tail != null) {
                        tail.next = null;
                    } else {
                        head = null;
                    }
                }

                // set the new size
                size--;

                return true;

            } else {
                // continue searching to next node
                currentNode = currentNode.next;

                pointer++;
            }
        }

        // we cannot find the given index
        return false;
    }

    public void printHeadToLast() {

        System.out.println("\nHead (" + head + ") ----------> Last (" + tail + "):");

        Node currentNode = head;
        while (currentNode != null) {

            System.out.print(currentNode);
            currentNode = currentNode.next;
        }

        System.out.println();
    }

    public void printLastToHead() {

        System.out.println("\nLast (" + tail + ") ----------> Head (" + head + "):");

        Node currentNode = tail;
        while (currentNode != null) {

            System.out.print(currentNode);
            currentNode = currentNode.prev;
        }

        System.out.println();
    }

    public int size() {
        return size;
    }
}
