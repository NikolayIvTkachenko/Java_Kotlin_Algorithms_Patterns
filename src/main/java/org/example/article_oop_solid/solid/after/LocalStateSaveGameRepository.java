package org.example.article_oop_solid.solid.after;

public class LocalStateSaveGameRepository  implements StateSaveGameRepository {
    @Override
    public void saveStateGame() {
        System.out.println("Save on local computer... ");
    }
}
