package org.example.algorithms_task;

import java.util.ArrayList;
import java.util.List;

public class ExtractCodePointsSurrogatePairsSolution {

    public static void main(String[] args) {

        test001();
        String str = String.valueOf(Character.toChars(128149));
        System.out.println("===============");
        System.out.println();
        List<Integer> answer01 = extract(str);
        System.out.println("answer01 = " + answer01);

        System.out.println("===============");
        System.out.println();
        List<Integer> answer02 = extract(str);
        System.out.println("answer02 = " + answer02);

        System.out.println("===============");
        System.out.println();



    }

    public static void test001() {
        char[] musicalScore = new char[] {'\uD83C', '\uDFBC'};
        char[] smileScore = new char[] {'\uD83D', '\uDE0D'};
        char[] twoHearts = new char[] {'\uD83D', '\uDC95'};
        char[] cyrillicZhe = new char[] {'\u04DC'};

        String str = "is" + String.valueOf(cyrillicZhe) + "zhe"
                + String.valueOf(twoHearts) + "two hearts"
                + String.valueOf(smileScore) + "smiley face and, "
                +String.valueOf(musicalScore) + "musical score";

        System.out.println("str ==> " + str);

    }

    public static List<Integer> extract(String str) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            int cp = str.codePointAt(i);
            if(i < str.length()-1 && str.codePointCount(i, i+2) == 1) {
                result.add(cp);
                result.add(str.codePointAt(i+1));
                i++;
            }
        }
        return result;
    }

    public static List<Integer> extractV2(String str) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            int cp = str.codePointAt(i);
            if(Character.charCount(cp) == 2) {
                result.add(cp);
                result.add(str.codePointAt(i+1));
                i++;
            }
        }
        return result;
    }

}
