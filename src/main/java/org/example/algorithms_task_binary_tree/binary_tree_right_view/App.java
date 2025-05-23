package org.example.algorithms_task_binary_tree.binary_tree_right_view;

public class App {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        System.out.println("Iterative approach:");
        bt.printRightViewIterative();

        System.out.println("\n\nRecursive approach:");
        bt.printRightViewRecursive();
    }
}
