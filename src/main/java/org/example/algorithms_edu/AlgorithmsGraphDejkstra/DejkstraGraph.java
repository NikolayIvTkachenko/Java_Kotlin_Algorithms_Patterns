package org.example.algorithms_edu.AlgorithmsGraphDejkstra;

public class DejkstraGraph {
    private final int MAX_VERTS = 20;
    private final int INFINITY = 1000000;

    private DejkstraVertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private int nTree;
    private DistrPar sPath[];
    private int currentVert;
    private int startToCurrent;

    public DejkstraGraph() {
        vertexList = new DejkstraVertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        nTree = 0;
        for(int j=0; j<MAX_VERTS; j++)
            for(int k=0; k<MAX_VERTS; k++)
                adjMat[j][k] = INFINITY;
        sPath = new DistrPar[MAX_VERTS];
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new DejkstraVertex(lab);
    }

    public void addEdge(int start, int end, int weight) {
        adjMat[start][end] = weight;
    }

    public void path() {
        int startTree = 0;
        vertexList[startTree].isInTree = true;
        nTree = 1;

        //Перемещение строки расстояний из adjMat  в sPath
        for(int j=0; j<nVerts; j++) {
            int tempDist = adjMat[startTree][j];
            sPath[j] = new DistrPar(startTree, tempDist);
        }

        while(nTree < nVerts) {
            int indexMin = getMin();
            int minDist = sPath[indexMin].distance;

            if(minDist == INFINITY) {
                System.out.print("There are unreacheble vertices");
                break;
            } else {
                currentVert = indexMin;
                startToCurrent = sPath[indexMin].distance;
                //Минимальное расстояние от startTree
                //до currentVert равно startToCurrent
            }
            //Включение текущей вершины в дерево
            vertexList[currentVert].isInTree = true;
            nTree++;
            adjust_sPath();
        }
        displayPaths();

        nTree = 0;
        for(int j=0; j<nVerts; j++)
            vertexList[j].isInTree = false;
    }

    public int getMin() {
        int minDist = INFINITY;
        int indexMin = 0;

        for(int j=1; j<nVerts; j++) {
            if(!vertexList[j].isInTree && sPath[j].distance < minDist){
                minDist = sPath[j].distance;
                indexMin = j;
            }
        }
        return indexMin;
    }

    public void adjust_sPath() {
        //Обновление данных в массиве кратчайших путей sPath
        int column = 1;
        while(column < nVerts) {
            //Если вершина column уже включена в дерево, она пропускается
            if(vertexList[column].isInTree) {
                column++;
                continue;
            }
            int currentToFringe = adjMat[currentVert][column];
            int startToFringe = startToCurrent + currentToFringe;
            int sPathDist = sPath[column].distance;

            if(startToFringe < sPathDist) {
                sPath[column].parentVert = currentVert;
                sPath[column].distance = startToFringe;
            }
            column++;
        }
    }

    public void displayPaths() {
        for(int j=0; j<nVerts; j++) {
            System.out.print(vertexList[j].label + "=");
            if(sPath[j].distance == INFINITY)
                System.out.print("inf");
            else
                System.out.print(sPath[j].distance);
            char parent = vertexList[sPath[j].parentVert].label;
            System.out.print("(" + parent + ")");
        }
        System.out.println("");
    }
}
