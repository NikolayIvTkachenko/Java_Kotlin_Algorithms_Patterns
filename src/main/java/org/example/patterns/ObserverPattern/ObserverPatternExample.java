package org.example.patterns.ObserverPattern;

public class ObserverPatternExample {
    public static void main(String[] args) {
        System.out.println("*** Observer Pattern Demo***\n");

        Observer testObserver1 = new ObserverType1("Roy");
        Observer testObserver2 = new ObserverType1("Kevin");
        Observer testObserver3 = new ObserverType2("Bose");

        Subject subject = new Subject();

        subject.register(testObserver1);
        subject.register(testObserver2);
        subject.register(testObserver3);

        System.out.println("Setting Flag = 5");
        subject.setFlag(5);

        subject.register(testObserver1);
        System.out.println("Setting Flag = 50");
        subject.setFlag(50);

        subject.register(testObserver1);
        System.out.println("Setting Flag = 100");
        subject.setFlag(100);
    }
}
