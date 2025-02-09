package org.example.algorithms_edu.AlgorithmsTrees;

public class Tree {
    private Node root;

    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if(key < current.iData)
                current = current.leftChild;
            else
                current = current.rightChild;

            if(current == null)
                return null;
        }
        return current;
    }

    public void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.iData = id;
        newNode.fData = dd;

        if(root == null)
            root = newNode;
        else {
            Node current = root;
            Node parent;
            while(true) {
                parent = current;
                if(id < current.iData) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void delete(int id) {

    }

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        if(successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    //Поиск минимум и максимума
    public Node minimum() {
        Node current, last = null;
        current = root;
        while(current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node maximum() {
        Node current, last = null;
        current = root;
        while(current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    //Реализация симметричго обхода дерева
    private void inOrder(Node localRoot) {
        inOrder(localRoot.leftChild);
        System.out.print(localRoot.iData + " ");
        inOrder(localRoot.rightChild);
    }
}
