package org.example.algorithms_task_sort_algo.interspersed_empty_string;

public class App {
    public static void main(String[] args) {

        String[] stringsArr = {"cat", "", "", "house", "", "", "", "", "laptop",
                "pen", "", "", "", "", "rear", "", "tower", "", ""};

        System.out.println("Search 'join':" + Strings.search(stringsArr, "join"));
        System.out.println("Search 'pen':" + Strings.search(stringsArr, "pen"));
        System.out.println("Search 'tower':" + Strings.search(stringsArr, "tower"));
        System.out.println("Search 'cat':" + Strings.search(stringsArr, "cat"));
        System.out.println("Search 'laptop':" + Strings.search(stringsArr, "laptop"));
        System.out.println("Search '':" + Strings.search(stringsArr, ""));
    }
}
