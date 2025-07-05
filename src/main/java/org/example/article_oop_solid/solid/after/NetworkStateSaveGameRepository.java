package org.example.article_oop_solid.solid.after;

public class NetworkStateSaveGameRepository implements StateSaveGameRepository {
    @Override
    public void saveStateGame() {
        System.out.println("Save use network on the game server ");
    }
}
