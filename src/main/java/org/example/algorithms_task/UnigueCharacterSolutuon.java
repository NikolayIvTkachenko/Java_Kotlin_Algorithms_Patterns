package org.example.algorithms_task;

import java.util.HashMap;
import java.util.Map;

public class UnigueCharacterSolutuon {

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
    private static final int MAX_CODE = 65535;

    public static boolean isUnique(String str) {
        System.out.println("==> isUnique");
        Map<Character, Boolean> chars = new HashMap<>();

        for(int  i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) <= MAX_CODE) {
                char ch = str.charAt(i);
                System.out.println("ch = " + ch);
                System.out.println("Character.isWhitespace(ch) = " + Character.isWhitespace(ch));
                if(!Character.isWhitespace(ch)) {
                    System.out.println("if(!Character.isWhitespace(ch)) {");
                    System.out.println("chars = " + chars);
                    if(chars.put(ch, true) != null) {
                        System.out.println("if(chars.put(ch, true) != null) {");

                        return false;
                    }
                }
            } else {
                System.out.println("Thr given string contains unallowed characters");
                return false;
            }
        }

        System.out.println("chars = " + chars);
        return true;
    }

}
