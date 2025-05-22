package org.example.algorithms_task;

import java.util.regex.Pattern;

public class StringRotationSolution {
    public static void main(String[] args) {

        String str1 = "helloworld";
        String str2 = "orldhellow";

        System.out.println("'" + str1 + "' is rotation of '"
                + str2 + "': " + isRotation(str1, str2));
    }

    public static boolean isRotation(String str1, String str2) {

        if (str1 == null || str2 == null || str1.isBlank() || str2.isBlank()) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        return (str1 + str1).matches("(?i).*" + Pattern.quote(str2) + ".*");
    }
}
