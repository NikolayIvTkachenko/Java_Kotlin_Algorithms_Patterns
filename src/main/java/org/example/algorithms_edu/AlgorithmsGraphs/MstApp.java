package org.example.algorithms_edu.AlgorithmsGraphs;

public class MstApp {
    public static void main(String[] args) {
        GraphMst theGraph = new GraphMst();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');

        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(0, 2); //AC
        theGraph.addEdge(0, 3); //AD
        theGraph.addEdge(0, 4); //AE
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(1, 3); //BD
        theGraph.addEdge(1, 4); //BE
        theGraph.addEdge(2, 3); //CD
        theGraph.addEdge(2, 4); //CE
        theGraph.addEdge(3, 4); //DE

        System.out.println("Visits: ");
        theGraph.mst();
        System.out.println();
    }
}
