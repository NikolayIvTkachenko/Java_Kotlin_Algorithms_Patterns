package org.example.algorithms_edu.SampleArray;

import org.example.algorithms_edu.AlgorithmsSort.ArrayInObjects;
import org.example.algorithms_edu.GeneralObject.SamplePerson;

public class ClassDataArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInObjects arr;
        arr = new ArrayInObjects(maxSize);

        arr.insert("Ivanov", "Dimitry", 28);
        arr.insert("Petrov", "Ivan", 32);
        arr.insert("Agupyan", "Nikolay", 25);
        arr.insert("Petrova", "Olga", 21);
        arr.insert("Akimova", "Nataliy", 22);
        arr.insert("Conor", "Jhon", 27);
        arr.insert("Fedorov", "Dimitry", 31);
        arr.insert("Volkov", "Sergey", 43);
        arr.insert("Zayzev", "Andrey", 37);
        arr.insert("Turok", "Petr", 38);

        arr.displayA();

        String searchKey = "Petrova";

        SamplePerson found;
        found = arr.find(searchKey);
        if(found != null) {
            System.out.println("Found ");
            found.displayPerson();
        } else {
            System.out.println("Can't find " + searchKey);
        }

        System.out.println("Deleting Turok, Conor, Petrov");

        arr.delete("Turok");
        arr.delete("Conor");
        arr.delete("Petrov");

        arr.displayA();
    }
}
