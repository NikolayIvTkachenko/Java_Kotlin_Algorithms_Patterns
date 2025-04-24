package org.example.struct_java.algo;

import java.util.Comparator;

public class MelonComparatorType implements Comparator<Melon> {
    @Override
    public int compare(Melon o1, Melon o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
