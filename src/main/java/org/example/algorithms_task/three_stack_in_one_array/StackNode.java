package org.example.algorithms_task.three_stack_in_one_array;

public class StackNode {

    int value;
    int backLink;

    StackNode(int value, int backLink) {
        this.value = value;
        this.backLink = backLink;
    }

    @Override
    public String toString() {
        return value + "(back link: " + backLink + ")";
    }

}

