package org.example.algorithms_edu.AlgorithmsTrees;

import java.util.Stack;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

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

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while(current.iData != key) {
            parent = current;
            if(key < current.iData) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null)
                return false;
        }
        //Удаляемый узел найден

        //Если узел не имеет потмоков он просо удаляется
        if(current.leftChild == null && current.rightChild == null) {
            if(current == root)
                root = null;
            else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        }
        //Если нет правого потовка, узел заменятся левым
        else if(current.rightChild == null) {
            if(current == root)
                root = current.leftChild;
            else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        }
        //Если нет левого потомка, узел заменяется правм поддеревом
        else if(current.leftChild == null) {
            if(current == root) {
                root = current.rightChild;
            } else if(isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }
        //Два потома, узел заменяется приемником
        else {
            Node successor = getSuccessor(current);
            //Родитель current  связывается с посредником
            if(current == root)
                root = successor;
            else if (isLeftChild) {
                parent.rightChild = successor;
            } else
                parent.rightChild = successor;
        }
        //Приемник связывается с левым потомком current
        return true;
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

    private void preOrder(Node localRoot) {
        if(localRoot != null) {
            System.out.print(localRoot.iData + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    //Реализация симметричго обхода дерева
    private void inOrder(Node localRoot) {
        inOrder(localRoot.leftChild);
        System.out.print(localRoot.iData + " ");
        inOrder(localRoot.rightChild);
    }

    private void postOrder(Node localRoot) {
        if(localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData + " ");
        }
    }

    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(".........................................................................");
        while(isRowEmpty==false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++)
                System.out.print(" ");
            while(globalStack.isEmpty() == false) {
                Node temp = (Node)globalStack.pop();
                if(temp != null) {
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if(temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j<nBlanks*2-2;j++)
                    System.out.print(" ");
            }
            System.out.println();
            nBlanks /= 2;
            while(localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        }
        System.out.println(".........................................................................");
    }
}
