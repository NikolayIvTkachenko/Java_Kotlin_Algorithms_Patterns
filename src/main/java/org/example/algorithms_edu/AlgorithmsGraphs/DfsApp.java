package org.example.algorithms_edu.AlgorithmsGraphs;

public class DfsApp {
    public static void main(String[] args) {
        GraphDfs theGraph = new GraphDfs();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');

        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(0, 3); //AD
        theGraph.addEdge(3, 4); //DE

        System.out.print("Visits: ");
        theGraph.dfs();
        System.out.println();
    }
}
