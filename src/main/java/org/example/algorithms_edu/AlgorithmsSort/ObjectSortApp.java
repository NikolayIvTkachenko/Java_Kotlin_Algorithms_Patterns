package org.example.algorithms_edu.AlgorithmsSort;

import org.example.algorithms_edu.GeneralObject.SamplePerson;
import org.example.algorithms_edu.SampleArray.ClassDataArray;

public class ObjectSortApp {

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

        System.out.println("=====================================================");
        arr.displayA();
        System.out.println("=====================================================");
        arr.insertionSort();
        arr.displayA();
        System.out.println("=====================================================");
    }

}
