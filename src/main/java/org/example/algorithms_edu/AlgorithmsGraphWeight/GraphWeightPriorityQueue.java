package org.example.algorithms_edu.AlgorithmsGraphWeight;

public class GraphWeightPriorityQueue {

    //Массив отсортирован по убыванию от ячейуи 0 до size-1
    private final int SIZE = 20;
    private GraphWeightEdge[] queArray;
    private int size;

    public GraphWeightPriorityQueue() {
        queArray = new GraphWeightEdge[SIZE];
        size = 0;
    }

    public void insert(GraphWeightEdge item) {
        int j;
        for(j=0; j<size; j++)
            if(item.distance >= queArray[j].distance)
                break;
        for(int k=size-1; k>=j; k--)
            queArray[k+1] = queArray[k];
        queArray[j] = item;
        size++;
    }

    public GraphWeightEdge removeMin() {
        return queArray[--size];
    }

    public void removeN(int n) {
        for(int j=n; j<size-1; j++)
            queArray[j] = queArray[j+1];
        size--;
    }

    public GraphWeightEdge peekMin() {
        return queArray[size-1];
    }

    public boolean isEmpty() {
        return (size==0);
    }

    public int size() {
        return size;
    }

    public GraphWeightEdge peekN(int n) {
        return queArray[n];
    }

    public int find(int findDex) {
        for(int j=0; j<size; j++)
            if(queArray[j].destVert == findDex)
                return j;
        return -1;
    }
}
