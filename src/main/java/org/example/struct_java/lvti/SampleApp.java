package org.example.struct_java.lvti;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleApp {
    public static void main(String[] args) {

        //programm001();
        //programm002();
        programm003();

    }



    public static void  programm003() {
        var arrayInt = new ArrayList<Integer>();
        arrayInt.add(5);
        arrayInt.add(null);
        arrayInt.add(6);
        System.out.println("Test 01");
        try {
            var summ = sumIntegers(arrayInt);
            System.out.println(summ);
        } catch (IllegalAccessException e) {
            System.out.println("Error -> " + e.getMessage());
        }

        System.out.println("Test 02");
        try {
            var summ = sumIntegers(null);
            System.out.println(summ);
        } catch (IllegalAccessException e) {
            System.out.println("Error -> " + e.getMessage());
        }
    }

    public static int sumIntegers(List<Integer> integers) throws IllegalAccessException {
        if(Objects.isNull(integers)) {
            throw new IllegalAccessException("List cannot be null");
        }
//        if(integers == null) {
//            throw new IllegalAccessException("List cannot be null");
//        }
        return integers
                .stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void programm002() throws FileNotFoundException {
        try(PrintWriter writer = new PrintWriter(new File("welcome.txt"))) {
            writer.println("Welcome text");
        }
    }



    public static void programm001() {
        var playerList = new ArrayList<String>();

        Player p1 = new Player();
        p1.name = "Jhon";
        Player p2 = new Player();
        p2.name = "Donald";

        var listOfPlayer = List.of(p1, p2);
        System.out.println(listOfPlayer);

        int[] numbers1 = new int[10];
        int number2[] = new int[10];


        var stack = new Stack<String>();
        stack.push("N1");
        stack.push("N2");
        stack.push("N3");

        stack.forEach(item -> System.out.println(item));

        var containsEven = true;
        Collection evensOrOdds = containsEven ? List.of(10, 2, 12) : Set.of(13, 15, 18);
        System.out.println(containsEven);
        System.out.println(evensOrOdds);

        Collection evensOrOdds2 = containsEven ? List.of(10, 2, 12) : Set.of(10, 2, 12);
        System.out.println(containsEven);
        System.out.println(evensOrOdds2);


        Stream<Integer> numberInt = Stream.of(1, 2, 3, 4, 5);
        numberInt.filter(t -> t % 2 == 0).forEach(System.out::println);

        //--------------------------------------
    }
}
