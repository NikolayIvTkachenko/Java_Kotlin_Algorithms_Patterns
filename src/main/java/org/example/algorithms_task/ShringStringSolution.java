package org.example.algorithms_task;

public class ShringStringSolution {


    //abbb vvvv s rttt rr eeee f
    //a1b3 v4 s1 r1t3 r2 e4 f1
    public static void main(String[] args) {
        String answer = "abbb vvvv s rttt rr eeee f";
        System.out.println("answer = " + answer);
        String result = shrink(answer);
        System.out.println("result = " + result);

    }

    public static String shrink(String str) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            count++;
            if(!Character.isWhitespace(str.charAt(i))) {
                if((i + 1) >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                    result.append(str.charAt(i)).append(count);
                    count = 0;
                }
            } else {
                result.append(str.charAt(i));
                count = 0;
            }
        }
        return result.length() > str.length() ? str : result.toString();
    }
}
