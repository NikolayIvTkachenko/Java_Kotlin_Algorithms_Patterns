package org.example.struct_java.lvti;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SampleClass {

    public SampleClass() {
        System.out.println(" Create SampleClass");
    }

    public void programm002() {
        List<Integer> ints = List.of(1, 1, 2, 3, 4, 4, 6, 2, 1, 5, 4, 5);
        System.out.println(ints);

        Collection<List<Integer>> evenAndOdd = ints
                .stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .values();
        System.out.println(evenAndOdd);

//        List<Integer> ebenOrOdd = evenAndOdd
//                .stream()
//                .map(Comparator.comparing(List::size))
//                .orElse(Collections.emptyList());
//        System.out.println(ebenOrOdd);
//
//        int sumEvenOrOdd = evenAndOdd.stream()
//                .mapToInt(Integer::intValue)
//                .sum();

    }
}
