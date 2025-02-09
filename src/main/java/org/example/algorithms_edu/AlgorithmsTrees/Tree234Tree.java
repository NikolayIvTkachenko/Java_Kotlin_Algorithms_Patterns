package org.example.algorithms_edu.AlgorithmsTrees;

public class Tree234Tree {

    private Tree234Node root = new Tree234Node();

    public int find(long key) {
        Tree234Node curNode = root;
        int childNumber;

        while(true) {
            if((childNumber=curNode.findItem(key)) != -1) {
                return childNumber;
            } else if (curNode.isLeaf()) {
                return -1;
            } else {
                curNode = getNextChild(curNode, key);
            }
        }
    }

    public void insert(long dValue) {
        Tree234Node curNode = root;
        Tree234DataItem tempItem = new Tree234DataItem((dValue));

        while(true) {
            if(curNode.isFull()) {
                split(curNode);
                curNode = curNode.getParent();
                curNode = getNextChild(curNode, dValue);
            } else if(curNode.isLeaf())
                break;
            else
                curNode = getNextChild(curNode, dValue);
        }
        curNode.insertItem(tempItem);
    }

    public void split(Tree234Node thisNode) {
        Tree234DataItem itemB, itemC;
        Tree234Node parent, child2, child3;
        int itemIndex;

        itemC = thisNode.removeItem();
        itemB = thisNode.removeItem();
        child2 = thisNode.disconnectChild(2);
        child3 = thisNode.disconnectChild(3);

        Tree234Node newRight = new Tree234Node();

        if(thisNode == root) {
            root = new Tree234Node();
            parent = root;
            root.connectChild(0, thisNode);
        } else {
            parent = thisNode.getParent();
        }

        //Разбираемся с родителям
        itemIndex = parent.insertItem(itemB);
        int n = parent.getNumItems();

        for(int j=n-1; j> itemIndex; j--) {
            Tree234Node temp = parent.disconnectChild(j);
            parent.connectChild(j+1, temp);
        }

        parent.connectChild(itemIndex+1, newRight);

        //Рахбираемся с узлом newRight
        newRight.insertItem(itemC);
        newRight.connectChild(0, child2);
        newRight.connectChild(1, child3);
    }

    public Tree234Node getNextChild(Tree234Node theNode, long theValue) {
        int j;
        int numItems = theNode.getNumItems();

        for(j=0; j<numItems; j++) {
            if(theValue < theNode.getItem(j).dData) {
                return theNode.getChild(j);
            }
        }
        return theNode.getChild(j);
    }

    public void displayTree() {
        recDisplayTree(root, 0, 0);
    }

    private void recDisplayTree(Tree234Node thisNode, int level, int childNumber) {
        System.out.print("level="+level+" child="+childNumber+" ");
        thisNode.displayNode();

        //Рекурсивный вызов для кадлого потомка текущего узла
        int numItems = thisNode.getNumItems();

        for(int j=0; j<numItems+1; j++) {
            Tree234Node nextNode = thisNode.getChild(j);
            if(nextNode != null)
                recDisplayTree(nextNode, level+1, j);
            else
                return;
        }
    }
}
