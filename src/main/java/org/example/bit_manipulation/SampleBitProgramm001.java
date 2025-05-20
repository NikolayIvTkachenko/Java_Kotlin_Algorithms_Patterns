package org.example.bit_manipulation;

public class SampleBitProgramm001 {

    public static void main(String[] args) {
        System.out.println("Binary: " + Integer.toString(51, 2));   //110011
        System.out.println("Binary: " + Integer.toBinaryString(51));    //110011
        System.out.println("Decimal: " + Integer.parseInt("110011", 2));    //51

        char result = getValueV1(5,2);
        System.out.println("result " + result);
        System.out.println("====================");
        System.out.println(2<<1);
        System.out.println(2<<2);
        System.out.println(2<<3);
        System.out.println(8>>2);
        System.out.println(8>>4);
        System.out.println(0<<2);
        System.out.println("====================");
        System.out.println(~(1<<2));
        System.out.println(Integer.toString((1<<2),2));
        System.out.println(Integer.toString(~(1<<2),2));
        System.out.println("====================");
        System.out.println(4 | 2);
        //100
        //010
        //---
        //110

        System.out.println(3 & 2);
        //011
        //010
        //---
        //010
        System.out.println(7 & 3);
        //111
        //011
        //---
        //011
        System.out.println("====================");
        System.out.println(-8>>1);
        System.out.println(-8>>>1);
        //Input -19  = 11111111|11111111|11111111|11101101
        //-19 >> 2   = 11111111|11111111|11111111|11111011  = -5
        //-19 >>> 2  = 00111111|11111111|11111111|11111011  = 1073741819
    }


    public static char getValueV1(int n, int k) {
        int result = n & (1<<k);
        System.out.println(1<<k);
        System.out.println(result);
        if(result == 0) {
            return '0';
        }
        return '1';
    }
}
