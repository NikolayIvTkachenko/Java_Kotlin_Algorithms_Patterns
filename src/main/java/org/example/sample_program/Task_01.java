package org.example.sample_program;

//Reverse Integer 32 bit (Размер Java по умолчанию)
//-2^21 <= x <= 2^21
//Input x = 123
//Output x = 321

//Input x = -123
//Output x = -321

//Input x = 120
//Output x = 21

//1534236469 //1056389759 //Incorrect

public class Task_01 {
    public static void main(String[] args) {
        //Test 01
        var test01 = reverseInteger01(123);
        System.out.println(test01);
        //Test 02
        var test02 = reverseInteger01(-123);
        System.out.println(test02);

        //Test 03
        var test03 = reverseInteger01(120);
        System.out.println(test03);

        //Second Version
        //Test 04
        var test04 = reverseInteger02(123);
        System.out.println(test04);
        //Test 05
        var test05 = reverseInteger02(-123);
        System.out.println(test05);

        //Test 06
        var test06 = reverseInteger02(120);
        System.out.println(test06);

        //Test 07
        var test07 = reverseInteger02(1534236469);
        System.out.println(test07);

        //Test 08
        var test08 = reverseInteger03(123);
        System.out.println(test08);
    }

    public static int reverseInteger01(int x) {
        var reversed = 0;
        var digit = 0;

        while( x != 0) {
            //123 => 321
            digit = x % 10; //123 % 10 = 3
            reversed = reversed * 10 + digit;
            x = x / 10; //123 / 10 = 12
        }
        return reversed;
    }

    public static int reverseInteger02(int x) {
        var reversed = 0L;
        var digit = 0;

        while( x != 0) {
            //123 => 321
            digit = x % 10; //123 % 10 = 3
            reversed = reversed * 10 + digit;
            x = x / 10; //123 / 10 = 12
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reversed;
    }

    //Реверс битов???? Нати решение
    //https://stackoverflow.com/questions/3165776/reverse-bits-in-number
    public static int reverseInteger03(int x) {
        int b=0;
        while (x!=0){
            b<<=1;
            b|=( x &1);
            x>>=1;
        }
//        while (x!=0){
//            b|=( x &1);
//            x>>=1;
//            b<<=1;
//        }
        return b;
    }
}
