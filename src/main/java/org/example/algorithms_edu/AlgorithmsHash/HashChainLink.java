package org.example.algorithms_edu.AlgorithmsHash;

public class HashChainLink {
    private int iData;
    public HashChainLink next;

    public HashChainLink(int it) {
        iData = it;
    }

    public int getKey() {
        return iData;
    }

    public void displayLink() {
        System.out.print(iData + " ");
    }
}
