package org.example.solid.ver01.SRP;

public class srcMainExample {
    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com");
        UserFileManager fileManager = new UserFileManager();
        fileManager.saveToFile(user);
    }
}
