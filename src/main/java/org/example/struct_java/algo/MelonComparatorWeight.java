package org.example.struct_java.algo;

import java.util.Comparator;

public class MelonComparatorWeight implements Comparator<Melon> {
    @Override
    public int compare(Melon melon1, Melon melon2) {
        return Integer.compare(melon1.getWeight(), melon2.getWeight());
    }
}
