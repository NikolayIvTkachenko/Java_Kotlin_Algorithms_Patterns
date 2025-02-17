package org.example.patterns.IteratorPattern;

public class Arts implements Subjects {
    private String[] papers;

    public Arts() {
        papers = new String[] {"English", "History", "Geography", "Psychology"};
    }

    @Override
    public Iterator createiterator() {
        return new ArtsIterator(papers);
    }
}
