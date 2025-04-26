package org.example.sample_program;

import java.util.*;
import java.util.stream.Collectors;

public class Task_00 {
    public static void main(String[] args) {

        //program01();
//        var key1 = isAnagramV1("Hello", "elloh");
//        System.out.println("key = " + key1);

//        var key2 = isAnagramV2("Hello", "elloh");
//        System.out.println("key = " + key2);
//
//        var key3 = isAnagramV2("Hwello", "elloh");
//        System.out.println("key = " + key3);

        //program02();
        program03();
    }

    ////Найти первый не повторяющийся элемент в массиве целых чисел
    public static void program01() {
        int[] arr = {9, 4, 9, 6, 7, 4, 5};
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int j : arr) {
            if (linkedHashMap.get(j) == null) {
                linkedHashMap.put(j, 1);
            } else {
                Integer count = linkedHashMap.get(j);
                count++;
                linkedHashMap.put(j, count);
            }
        }
        Integer firstElement = linkedHashMap
                .entrySet()
                .stream()
                .filter(item -> item.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow(RuntimeException::new);
        System.out.println(firstElement);
    }

    //Найти первый не повторяющийся элемент в массиве целых чисел
    //public static void main(String[] args) {
    //  int[] arr = {9, 4, 9, 6, 7, 4, 5};
    //  int n = ...
    //}
    public static void program02() {
        int[] arr = {9, 4, 9, 6, 7, 4, 5};
        Arrays.stream(arr).forEach(item -> System.out.println("source = " + item + ""));
        System.out.println();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        Arrays.stream(arr).forEach(item -> {
            if (linkedHashMap.get(item) == null) {
                linkedHashMap.put(item, 1);
            } else {
                Integer count = linkedHashMap.get(item);
                count++;
                linkedHashMap.put(item, count);
            }
        });
        var firstValue = linkedHashMap.entrySet().stream().filter(item -> item.getValue() == 1).findFirst();
        System.out.println(firstValue);


        //        linkedHashMap.entrySet().forEach(item -> {
//                    //System.out.println("key = " + item.getKey() + ", value = " + item.getValue());
//                    if (item.getValue() == 1) {
//                        System.out.println(item.getKey());
//                    }
//                }
//        );
    }

    public static void program03() {
        int[] arr = {9, 4, 9, 6, 7, 4, 5};
        Arrays.stream(arr).forEach(item -> System.out.print(item + " "));
        System.out.println();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        Arrays.stream(arr).forEach(item -> {
            if (linkedHashMap.get(item) == null) {
                linkedHashMap.put(item, 1);
            } else {
                Integer count = linkedHashMap.get(item);
                count++;
                linkedHashMap.put(item, count);
            }
        });
        var firstValue = linkedHashMap.entrySet().stream().filter(item -> item.getValue() == 1).findFirst();
        System.out.println(firstValue);

    }

    ////Ппроверка, являются ли две строки аннаграммами
    private static final int EXTENDED_ASCII_CODES = 256;

    public static boolean isAnagramV1(String str1, String str2) {
        int[] chCounts = new int[EXTENDED_ASCII_CODES];
        char[] chStr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] chStr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        System.out.println(chStr1);
        System.out.println(chStr2);

        if (chStr1.length != chStr2.length) {
            return false;
        }

        for (int i = 0; i < chStr1.length; i++) {
            chCounts[chStr1[i]]++;
            chCounts[chStr2[i]]--;
        }

        for (int i = 0; i < chCounts.length; i++) {
            //System.out.println(chCounts[i]);
            if (chCounts[i] != 0) return false;
        }
        return true;
    }

    public static boolean isAnagramV2(String str1, String str2) {
        System.out.println(str1);
        System.out.println(str2);
        var lowerStr1 = str1.trim().replaceAll("\\s", "").toLowerCase().toCharArray();
        var lowerStr2 = str2.trim().replaceAll("\\s", "").toLowerCase().toCharArray();
        System.out.println(lowerStr1);
        System.out.println(lowerStr2);

        if (str1.length() != str2.length()) {
            return false;
        }
        Arrays.sort(lowerStr1);
        Arrays.sort(lowerStr2);

        return Arrays.equals(lowerStr1, lowerStr2);
    }
}
