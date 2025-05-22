package org.example.algorithms_task;

import java.util.ArrayList;
import java.util.List;

public class ExtractingSolution {

    public static void main(String[] args) {
        //cv dd 4 k 2321 2 11 k4k2 66 4d
        //4, 2321, 2, 11, 4, 2, 66, and 4
        String request = "cv dd 4 k 2321 2 11 k4k2 66 4d";
        System.out.println("request = " + request);
        List<Integer> result = extract(request);
        System.out.println("result = " + result);
        System.out.println();
        System.out.println();

    }

    public static List<Integer> extract(String str) {
        System.out.println("==> extract");
        System.out.println("str = " + str);
        System.out.println(String.valueOf(Integer.MAX_VALUE).length());
        List<Integer> result = new ArrayList();
        StringBuilder temp = new StringBuilder(
                String.valueOf(Integer.MAX_VALUE).length()
        );

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isDigit(ch)) {
                temp.append(ch);
            } else {
                if(temp.length() > 0) {
                    result.add(Integer.parseInt(temp.toString()));
                    temp.delete(0, temp.length());
                }
            }
        }
        return result;
    }

}
