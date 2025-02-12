package org.example.patterns.Simgleton;

//not final class
public class Captain {
    private static Captain captain;

    static int numberOfInstance = 0;
    private Captain() {
        numberOfInstance++;
        System.out.println("Number of instance at this moment=" + numberOfInstance);
    }

    public static synchronized Captain getCaptain() {
        //Lazy initialization
        if(captain == null) {
            captain = new Captain();
        }
        return captain;
    }

    public static void dummyMethod() {
        System.out.println("It is a dummy method");
    }

    public class CaptainDerived extends Captain {
        public CaptainDerived() {
            System.out.println("CaptainDerived()");
        }
    }
}
