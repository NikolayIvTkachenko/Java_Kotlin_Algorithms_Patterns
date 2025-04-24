package org.example.struct_java.algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SampleApp03 {
    public static void main(String[] args) {
        //program01();
        //program02();
        //program03();
        //program04();
        //program05();
        //program06();
        //program07();

        program08();


    }

    public static void program08() {
        int[] integers1 = new int[]{1, 5, 3, -5, 2, 0, -6, 8, 1, 44, 23, 4};
        int[] integers2 = new int[]{1, 5, 3, -5, 2, 0, -6, 8, 1, 44, 23, 4};
        int[] integers3 = new int[]{1, 5, 1, -5, 2, 0, -6, 8, 1, 44, 23, 4};
        int[] integers4 = new int[]{1, 5, 1, -5, 2, 0, -6, 8, 1, 44, 0, 4, 89};
        System.out.println("Equals");
        boolean result1 = Arrays.equals(integers1, integers2);
        boolean result2 = Arrays.equals(integers1, integers3);
        System.out.println(result1);
        System.out.println(result2);

        System.out.println("Mismatch");


    }

    public static void program07() {
        int[] integers = new int[]{1, 5, 3, -5, 2, 0, -6, 8, 1, 44, 23, 4};
        Arrays.stream(integers).forEach(item -> System.out.print(item + " "));
        System.out.println();

        UtilsSorts.heapSort(integers);
        Arrays.stream(integers).forEach(item -> System.out.print(item + " "));
    }

    public static void program06() {
        int[] integers = new int[]{1, 5, 3, -5, 2, 0, -6, 8, 1, 44, 23, 4};
        Arrays.stream(integers).forEach(item -> System.out.print(item + " "));
        System.out.println();

        UtilsSorts.countingSort(integers);
        Arrays.stream(integers).forEach(item -> System.out.print(item + " "));
    }


    //int[] integers = new int[]{1, 5, 3, -5, 2, 0, -6, 8, 1, 44, 23, 4};
    public static void program05() {
        int[] integers = new int[]{1, 5, 3, -5, 2, 0, -6, 8, 1, 44, 23, 4};
        Arrays.stream(integers).forEach(item -> System.out.print(item + " "));
        //reverse compare
        var arrayNew = Arrays.stream(integers)
                .boxed()
                .sorted((i1, i2) -> Integer.compare(i2, i1))
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println();
        System.out.println();
        Arrays.stream(arrayNew).forEach(item -> System.out.print(item + " "));
    }

    public static void program04() {
        List<Melon> melons = Arrays.asList(
                new Melon("Crenshaw", 1200, Melon.Sugar.LOW),
                new Melon("Gac", 3000, Melon.Sugar.HIGH),
                new Melon("Hemi", 2600, Melon.Sugar.MEDIUM),
                new Melon("Hemi", 1600, Melon.Sugar.HIGH),
                new Melon("Gac", 1200, Melon.Sugar.LOW),
                new Melon("Apollo", 2600, Melon.Sugar.MEDIUM),
                new Melon("Horned", 1700, Melon.Sugar.UNKNOWN),
                new Melon("Gac", 3050, Melon.Sugar.HIGH),
                new Melon("Hemi", 2600, Melon.Sugar.LOW)
        );

        Melon[] melonsArray = new Melon[melons.size()];
        melons.toArray(melonsArray);

        UtilsSorts.bubbleSortWithComparator(melonsArray, new MelonComparatorWeight());
        Arrays.stream(melonsArray).forEach(item -> System.out.println(item + " "));
        System.out.println();
        System.out.println();
        UtilsSorts.bubbleSortWithComparator(melonsArray, new MelonComparatorType());
        Arrays.stream(melonsArray).forEach(item -> System.out.println(item + " "));
    }

    public static void program03() {
        Integer[] integers = new Integer[] {3, 1, 5};
        Arrays.sort(integers);
        Arrays.stream(integers).forEach(item -> System.out.print(item + " "));
        System.out.println();
        System.out.println();
        Arrays.sort(integers, Collections.reverseOrder());
        Arrays.stream(integers).forEach(item -> System.out.print(item + " "));
    }


    public static void program02() {
        List<Melon> melons = Arrays.asList(
                new Melon("Crenshaw", 1200),
                new Melon("Gac", 3000),
                new Melon("Hemi", 2600),
                new Melon("Hemi", 1600),
                new Melon("Gac", 1200),
                new Melon("Apollo", 2600),
                new Melon("Horned", 1700),
                new Melon("Gac", 3050),
                new Melon("Hemi", 2600)
        );

        Melon[] melonsArray = new Melon[melons.size()];
        melons.toArray(melonsArray);

        //Принимает только массив!!!!!!
        Arrays.sort(melonsArray, new Comparator<Melon>() {
            @Override
            public int compare(Melon melon1, Melon melon2) {
                return Integer.compare(melon1.getWeight(), melon2.getWeight());
            }
        });

        Arrays.stream(melonsArray).forEach(item -> System.out.println(item));
        System.out.println();

        //lambda comparator
        Arrays.sort(melonsArray, (Melon melon1, Melon melon2) -> {
                    return Integer.compare(melon1.getWeight(), melon2.getWeight());
                }
        );

        //short lambda comparator
        Arrays.sort(melonsArray, Comparator.comparingInt(Melon::getWeight)
        );

    }

    public static void program01() {
        int[] integers = new int[]{1, 5, 3, -5, 2, 0, -6, 8, 1, 44, 23, 4};
        //Arrays.stream(integers).map( item -> System.out.println(item))
        System.out.println(integers);
        Arrays.stream(integers).forEach(item -> System.out.print(item + " "));
        Arrays.sort(integers);
        System.out.println(integers);
        Arrays.stream(integers).forEach(item -> System.out.print(item + " "));
    }
}
