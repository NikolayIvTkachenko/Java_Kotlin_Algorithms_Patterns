package org.example.solid.ver02.LSP;

public class OmenHpComputer extends Computer {
    public OmenHpComputer(String name, int memory_size) {
        super(name, memory_size);
    }

    @Override
    public void setName(String name) {
        this.name = name;
        this.memory_size = 200000; //<- это нарушение принципа Барбары Лисков
        //Так как поведенеи изменилось
    }
}
