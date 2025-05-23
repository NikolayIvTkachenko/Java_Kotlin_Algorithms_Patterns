package org.example.algorithms_task_sort_algo.unknown_size_list;

public class App {
    public static void main(String[] args) {

        int[] slArr = {-2, 3, 12, 14, 16, 22, 23, 27};
        SizelessList sl = new SizelessList(slArr);

        System.out.println("Search 2: " + UnknownSizeList.search(sl, 3));
        System.out.println("Search 23: " +UnknownSizeList.search(sl, 23));
        System.out.println("Search 1: " +UnknownSizeList.search(sl, 1));
    }
}
