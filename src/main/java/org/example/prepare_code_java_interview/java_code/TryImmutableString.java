package org.example.prepare_code_java_interview.java_code;

public class TryImmutableString {
    public static void main(String[] args) {
        String strVar = "Welcome";
        strVar.concat(" to Java");
        System.out.println(strVar);

        strVar = strVar.concat(" to Java");
        System.out.println(strVar);
    }
}
