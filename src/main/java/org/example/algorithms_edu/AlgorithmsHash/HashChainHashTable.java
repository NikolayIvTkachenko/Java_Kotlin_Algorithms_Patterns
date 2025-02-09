package org.example.algorithms_edu.AlgorithmsHash;

public class HashChainHashTable {
    private HashChainSortedList[] hashArray;
    private int arraySize;

    public HashChainHashTable(int size) {
        arraySize = size;
        hashArray = new HashChainSortedList[arraySize];
        for(int j=0; j<arraySize; j++)
            hashArray[j] = new HashChainSortedList();
    }

    public void displayTable() {
        for(int j=0; j<arraySize; j++) {
            System.out.print(j + ". ");
            hashArray[j].displayList();
        }
    }

    public int hashFunc(int key) {
        return key % arraySize;
    }

    public void insert(HashChainLink theLink) {
        System.out.println("Step 01 => HashChainHashTable insert ");
        System.out.println("theLink = " + theLink);
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theLink);
    }

    public void delete(int key) {
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }

    public HashChainLink find(int key) {
        int hashVal = hashFunc(key);
        HashChainLink theLink = hashArray[hashVal].find(key);
        return theLink;
    }

}
