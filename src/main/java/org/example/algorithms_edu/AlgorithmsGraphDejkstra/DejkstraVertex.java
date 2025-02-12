package org.example.algorithms_edu.AlgorithmsGraphDejkstra;

public class DejkstraVertex {
    public char label;
    public boolean isInTree;

    public DejkstraVertex(char lab) {
        label = lab;
        isInTree = false;
    }
}
