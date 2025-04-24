package org.example.struct_java.algo;

import java.util.Arrays;
import java.util.List;

public class WorkCollections {

    public static List<Melon> getMelonCollectionList() {
        List<Melon> melons = Arrays.asList(
                new Melon("Crenshaw", 1200),
                new Melon("Gac", 3000),
                new Melon("Hemi", 2600),
                new Melon("Hemi", 1600),
                new Melon("Gac", 1200),
                new Melon("Apollo", 2600),
                new Melon("Horned", 1700),
                new Melon("Gac", 3000),
                new Melon("Hemi", 2600)
        );
        return melons;
    }

    public static Melon[] getMelonCollectionArray() {
        List<Melon> melons = Arrays.asList(
                new Melon("Crenshaw", 1200),
                new Melon("Gac", 3000),
                new Melon("Hemi", 2600),
                new Melon("Hemi", 1600),
                new Melon("Gac", 1200),
                new Melon("Apollo", 2600),
                new Melon("Horned", 1700),
                new Melon("Gac", 3000),
                new Melon("Hemi", 2600)
        );

        Melon[] melonsArray = new Melon[melons.size()];
        melons.toArray(melonsArray);
        return melonsArray;
    }
}
