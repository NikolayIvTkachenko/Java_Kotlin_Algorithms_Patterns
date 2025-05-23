package org.example.algorithms_edu.AlgorithmsGraphs;

//Minimum spanning tree
public class GraphMst {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private GraphStackX theStack;

    public GraphMst() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;

        for(int j=0; j<MAX_VERTS; j++)
            for(int k=0; k<MAX_VERTS; k++)
                adjMat[j][k] = 0;
        theStack = new GraphStackX();
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }

    public void mst() {
        vertexList[0].wasVisited = true;
        theStack.push(0);

        while(!theStack.isEmpty()) {
            int currentVertex = theStack.peek();
            int v = getAdjUnvisitedVertex(currentVertex);

            if(v == -1)
                theStack.pop();
            else {
                vertexList[v].wasVisited = true;
                theStack.push(v);

                displayVertex(currentVertex);
                displayVertex(v);
                System.out.println(" ");
            }
        }
        //Стек пусть, работа закончена
        for(int j=0; j<nVerts; j++)
            vertexList[j].wasVisited = false;
    }

    //Метод возвращает не посещенную вершину, смежную по отношению к v
    public int getAdjUnvisitedVertex(int v) {
        for(int j=0; j<nVerts;j++)
            if(adjMat[v][j] == 1 && vertexList[j].wasVisited==false)
                return j;
        return -1;
    }
}
