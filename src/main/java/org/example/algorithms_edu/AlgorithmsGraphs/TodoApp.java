package org.example.algorithms_edu.AlgorithmsGraphs;

public class TodoApp {
    public static void main(String[] args) {
        GraphTopo theGraph = new GraphTopo();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        theGraph.addVertex('F');
        theGraph.addVertex('G');
        theGraph.addVertex('H');

        theGraph.addEdge(0, 3); //AD
        theGraph.addEdge(0, 4); //AE
        theGraph.addEdge(1, 4); //BE
        theGraph.addEdge(2, 5); //CF
        theGraph.addEdge(3, 6); //DG
        theGraph.addEdge(4, 6); //EG
        theGraph.addEdge(5, 7); //FH
        theGraph.addEdge(6, 7); //GH

        System.out.println("Visits: ");
        theGraph.topo();
        System.out.println();
    }
}
