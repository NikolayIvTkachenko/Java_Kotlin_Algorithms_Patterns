package org.example.threads_concurency.thread002;

import org.example.threads_concurency.thread001.ThreadY;
import org.example.threads_concurency.thread001.ThreadZ;

import java.util.Date;
import java.util.stream.Stream;

public class ThreadExample001 {
    public static void main(String arg[]) {
        ThreadZ threadZ = new ThreadZ();
        //threadZ.countThread = 155;

        int x = 2, y = 2, z = 2;
        System.out.println(x*y|z);

        //octal
        int iValue1 = 0111;
        //hexadecimal
        int iValue2 = 0xf1dead;

        System.out.println(iValue1);
        System.out.println(iValue2);

        String strVar = "Welcpme";
        strVar.concat(" to Java");
        System.out.println(strVar);

        strVar = strVar.concat(" to Java");
        System.out.println(strVar);

        String obj1 = "Hello";
        String obj2 = "Hello";
        String obj3 = new String("Hello");

        System.out.println(obj1 == obj2);
        System.out.println(obj1 == obj3);

        Stream<Date> stream1 = Stream.generate(() -> { return new Date();});
        stream1.forEach(cnt -> System.out.println(cnt));

    }
}
