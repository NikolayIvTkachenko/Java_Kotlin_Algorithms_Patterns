package org.example.algorithms_task_binary_tree.binary_search_tree_successor;

public class App {
    public static void main(String[] args) {

    /*
              70
            /    \
          50      75
         /  \    /  \
        40  55  72  77
       /   /  \
      35  54   60
              /
             58
              \
              59
    */
        BinarySearchTree bt = new BinarySearchTree();

        bt.buildTreeSample();

        bt.inOrderSuccessor();
        bt.preOrderSuccessor();
        bt.postOrderSuccessor();
    }
}
