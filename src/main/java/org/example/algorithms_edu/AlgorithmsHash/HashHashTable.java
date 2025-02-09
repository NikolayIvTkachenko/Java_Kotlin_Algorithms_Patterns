package org.example.algorithms_edu.AlgorithmsHash;

public class HashHashTable {
    private HashDataItem[] hashArray;
    private int arraySize;
    private HashDataItem nonItem;

    public HashHashTable(int size) {
        arraySize = size;
        hashArray = new HashDataItem[arraySize];
        nonItem = new HashDataItem(-1);
    }

    public void displayTable() {
        System.out.print("Table: ");
        for(int j=0; j<arraySize; j++) {
            if(hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println("");
    }

    public int hashFunc(int key) {
        return key % arraySize;
    }

    public void insert(HashDataItem item) {
        int key = item.getKey();
        int hashVal = hashFunc(key);

        while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            ++hashVal;
            hashVal %= arraySize;
        }
        hashArray[hashVal] = item;
    }

    public HashDataItem delete(int key) {
        int hashVal = hashFunc(key);

        while(hashArray[hashVal] != null) {
            if(hashArray[hashVal].getKey() == key) {
                HashDataItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }

    public HashDataItem find(int key) {
        //поиск элемента с заданным ключом
        //Метод предполагает, что таблица не заполнена
        int hashVal = hashFunc(key);
        while(hashArray[hashVal] != null) {
            if(hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }
}
