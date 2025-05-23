package org.example.algorithms_task_oop.file_system;

public class File extends Item {

    private String content;
    private int size;

    public File(String name, Directory parent) {

        super(name, parent);
    }

    @Override
    public long size() {
        return size;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    public void setContent(String content) {}

    public String getContent() {
        return content;
    }
}
