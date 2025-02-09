package org.example.algorithms_edu.AlgorithmsTrees;

public class Tree234Node {

    private static final int ORDER = 4;
    private int numItems;
    private Tree234Node parent;
    private Tree234Node childArray[] = new Tree234Node[ORDER];
    private Tree234DataItem itemArray[] = new Tree234DataItem[ORDER-1];

    //Связывание узла с потомком
    public void connectChild(int childNum, Tree234Node child) {
        childArray[childNum] = child;
        if(child != null)
            child.parent = this;
    }

    //Метод отсоединяет потомка от узла и возвращает его
    public Tree234Node disconnectChild(int childNum) {
        Tree234Node tempNode = childArray[childNum];
        childArray[childNum] = null;
        return tempNode;
    }

    public Tree234Node getChild(int childNum) {
        return childArray[childNum];
    }

    public Tree234Node getParent() {
        return parent;
    }

    public boolean isLeaf() {
        return childArray[0]==null ? true : false;
    }

    public int getNumItems(){
        return  numItems;
    }

    public Tree234DataItem getItem(int index) {
        return itemArray[index];
    }

    public boolean isFull() {
        return (numItems==ORDER-1) ? true : false;
    }

    public int findItem(long key) {
        for(int j=0; j<ORDER-1; j++) {
            if(itemArray[j] == null)
                break;
            else if (itemArray[j].dData == key) {
                return j;
            }
        }
        return  -1;
    }

    public int insertItem(Tree234DataItem newItem) {
        //Предполагается, что узел не пуст
        numItems++;
        long newKey = newItem.dData;
        for(int j=ORDER-2; j>=0; j--) {
            if(itemArray[j] == null)
                continue;
            else {
                long itsKey = itemArray[j].dData;
                if(newKey < itsKey)
                    itemArray[j+1] = itemArray[j];
                else {
                    itemArray[j+1] = newItem;
                    return j+1;
                }
            }
        }
        itemArray[0] = newItem;
        return 0;
    }


    public Tree234DataItem removeItem() {
        Tree234DataItem temp = itemArray[numItems-1];
        itemArray[numItems-1] = null;
        numItems--;
        return temp;
    }

    public void displayNode() {
        for(int j=0; j<numItems; j++)
            itemArray[j].displayItem();
        System.out.println("/");
    }

}
