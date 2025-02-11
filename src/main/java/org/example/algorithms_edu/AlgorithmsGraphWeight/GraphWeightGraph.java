package org.example.algorithms_edu.AlgorithmsGraphWeight;

public class GraphWeightGraph {

    private final int MAX_VERTS = 20;
    private final int INFINITY = 1000000;
    private GraphWeightVertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private int currentVert;
    private GraphWeightPriorityQueue thePQ;
    private int nTree;

    public GraphWeightGraph() {
        vertexList = new GraphWeightVertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for(int j=0; j<MAX_VERTS; j++) //Матрица смежности заполняется нулями
            for(int k=0; k<MAX_VERTS; k++)
                adjMat[j][k] = INFINITY;
        thePQ = new GraphWeightPriorityQueue();
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new GraphWeightVertex(lab);
    }

    public void addEdge(int start, int end, int weight) {
        adjMat[start][end] = weight;
        adjMat[end][start] = weight;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }

    public void mstw() {
        currentVert = 0;
        while(nTree < nVerts-1) {
            vertexList[currentVert].isInTree = true;
            nTree++;

            //Вставка в приоритетную очередь ребер, смежных с currentVert
            for(int j=0; j<nVerts; j++) {
                if(j==currentVert) {
                    continue;
                }
                if(vertexList[j].isInTree)
                    continue;
                int distance = adjMat[currentVert][j];
                if(distance == INFINITY)
                    continue;
                putInPQ(j, distance);
            }
            if(thePQ.size() == 0) {
                System.out.println("GRAPH NOT CONNECTED");
                return;
            }

            GraphWeightEdge theEdge = thePQ.removeMin();
            int sourceVert = theEdge.srcVert;
            currentVert = theEdge.destVert;

            //Вывод ребра от начальной до текущей вершины
            System.out.print(vertexList[sourceVert].label);
            System.out.print(vertexList[currentVert].label);
            System.out.print(" ");

        }
        //Минимальное оставное дерево построено
        for(int j=0; j<nVerts; j++)
            vertexList[j].isInTree = false;
    }

    public void putInPQ(int newVert, int newDist) {
        //Существует ли другое ребро с той же конечной вершиной
        int queueIndex = thePQ.find(newVert);
        if(queueIndex != -1) {
            GraphWeightEdge tempEdge = thePQ.peekN(queueIndex);
            int oldDist = tempEdge.distance;
            if(oldDist > newDist) {
                thePQ.removeN(queueIndex);
                GraphWeightEdge theEdge = new GraphWeightEdge(currentVert, newVert, newDist);
                thePQ.insert(theEdge);
            }
        } else {
            GraphWeightEdge theEdge = new GraphWeightEdge(currentVert, newVert, newDist);
            thePQ.insert(theEdge);
        }
    }
}
