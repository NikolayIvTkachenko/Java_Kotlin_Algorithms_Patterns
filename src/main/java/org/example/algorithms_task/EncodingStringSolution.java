package org.example.algorithms_task;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EncodingStringSolution {

    public static void main(String[] args) {
        String strLine = "  String   with spaces  ";
        char[] str = strLine.toCharArray();
        System.out.println("strLine  = " + strLine);
        System.out.println("str = " + str);
        Stream<char[]> streambefore = Stream.of(str);
        streambefore.map(i -> {
                    System.out.print(Arrays.toString(i) + " ==> ");
                    return i;
                }
        ).collect(Collectors.toList());

        char[] result = encodeWhitespaces(str);
        System.out.println("after result = " + result);
        System.out.println();
        Stream<char[]> streamresult = Stream.of(result);
        streamresult.map(i -> {
                    System.out.print(Arrays.toString(i) + " ==> ");
                    return i;
                }
        ).collect(Collectors.toList());

    }

    public static char[] encodeWhitespaces(char[] str) {
        System.out.println("==> encodeWhitespaces");
        System.out.println("str = " + str);
        int countWhitespaces = 0;
        System.out.println("before countWhitespaces = " + countWhitespaces);
        for (int i = 0; i < str.length; i++) {
            if (Character.isWhitespace(str[i])) {
                countWhitespaces++;
            }
        }
        System.out.println("after countWhitespaces = " + countWhitespaces);
        if (countWhitespaces > 0) {
            char[] encodedStr = new char[str.length + countWhitespaces * 2];
            int index = 0;

            for (int i = 0; i < str.length; i++) {
                if (Character.isWhitespace(str[i])) {
                    encodedStr[index] = '0';
                    encodedStr[index + 1] = '2';
                    encodedStr[index + 2] = '%';
                    index = index + 3;
                } else {
                    encodedStr[index] = str[i];
                    index++;
                }
            }
            return encodedStr;
        }
        return str;
    }
}
