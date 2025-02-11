package org.example.algorithms_edu.AlgorithmsGraphWeight;

public class GraphWeightEdge {

    public int srcVert; //Индекс начальной вершины ребра
    public int destVert; //Индекс конечной вершины ребра
    public int distance; //Расстояние от начала до конца

    public GraphWeightEdge(int sv, int dv, int d) {
        srcVert = sv;
        destVert = dv;
        distance = d;
    }
}
