package org.example.algorithms_task;

public class IsOneEditAwaySolution {

    public static void main(String[] args) {
        String t1 = "tank";
        String t2 = "tanc";
        String t3 = "tank";
        String t4 = "tankist";
        Boolean result01 = isOneEditAway(t1, t2);
        Boolean result02 = isOneEditAway(t3, t4);

        System.out.println();
        System.out.println();

    }

    public static boolean isOneEditAway(String q, String p) {
        if(Math.abs(q.length() - p.length()) > 1) {
            return false;
        }

        String shorter = q.length() < p.length() ? q : p;
        String longer = q.length() < p.length() ? p : q;

        int is = 0;
        int il = 0;
        boolean marker = false;

        while(is < shorter.length() && il < longer.length()) {
            if(shorter.charAt(is) != longer.charAt(il)) {
                if(marker) {
                    return false;
                }
                marker = true;

                if(shorter.length() == longer.length()) {
                    is++;
                }
            } else {
                is++;
            }
            il++;
        }
        return true;
    }

}
