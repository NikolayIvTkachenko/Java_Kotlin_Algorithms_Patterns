package org.example.patterns.IteratorPattern;

public class IteratorPatternExample {
    public static void main(String[] args) {
        System.out.println("***  Iterator Pattern Demo ***");
        Subjects artsSubjects = new Arts();

        Iterator iteratorForArts = artsSubjects.createiterator();
        System.out.println("\n Arts subjects are as follows: ");

        while(iteratorForArts.hasNext()) {
            System.out.println(iteratorForArts.next());
        }

        iteratorForArts.first();
        System.out.println("Currently pointing back to: " + iteratorForArts.currentItem());

    }
}
