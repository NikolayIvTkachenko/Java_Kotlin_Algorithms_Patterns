package org.example.algorithms_task;

public class UniqueCharacterV2Solution {

    public static void main(String[] args) {
        String str01 = "Hello";
        Boolean result01 = isUnique(str01);
        System.out.println(str01);
        System.out.println(result01);
        System.out.println("==>");
        String str02 = "Helo";
        Boolean result02 = isUnique(str02);
        System.out.println(str02);
        System.out.println(result02);

    }

    private static final char A_CHAR = 'a';

    public static boolean isUnique(String str) {
        System.out.println("==>> isUnique");
        System.out.println("atr = " + str);
        int marker = 0;
        System.out.println("before marker = " + marker);
        System.out.println(Integer.toString(marker, 2));

        for(int i = 0; i < str.length(); i++) {
            System.out.println("=====");
            int s = str.charAt(i) - A_CHAR;
            System.out.println("s = " + s);
            System.out.println(Integer.toString(s, 2));
            int mask = 1 << s;
            System.out.println("mark = " + mask);
            System.out.println(Integer.toString(mask, 2));
            if((marker & mask) > 0) {
                return false;
            }

            marker = marker | mask;
            System.out.println("before marker = " + marker);
            System.out.println(Integer.toString(marker, 2));
        }
        return true;
    }

}

//----------------------------------------------------------------------------------------------
//122                           //97
//10000000000000000000000000
//zyxwvutsrqponmlkjihgfedcba

//10000000000000000000000001 = a