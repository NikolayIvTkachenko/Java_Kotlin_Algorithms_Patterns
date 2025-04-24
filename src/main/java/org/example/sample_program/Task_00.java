package org.example.sample_program;

import java.util.LinkedHashMap;
import java.util.Map;




public class Task_00 {
    public static void main(String[] args) {

        program01();

    }

    ////Найти первый не повторяющийся элемент в массиве целых чисел
    public static void program01() {
        int[] arr = {9, 4, 9, 6, 7, 4, 5};
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int j : arr) {
            if (linkedHashMap.get(j) == null) {
                linkedHashMap.put(j, 1);
            } else {
                Integer count = linkedHashMap.get(j) ;
                count++;
                linkedHashMap.put(j, count);
            }
        }
        Integer firstElement = linkedHashMap
                .entrySet()
                .stream()
                .filter( item -> item.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow(RuntimeException::new);
        System.out.println(firstElement);
    }
}
