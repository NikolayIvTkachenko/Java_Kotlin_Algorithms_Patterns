package org.example.algorithms_edu.AlgorithmsSort;

import org.example.algorithms_edu.GeneralObject.SamplePerson;

public class ArrayInObjects {
    private SamplePerson[] a;
    private int nElems;

    public ArrayInObjects(int max) {
        a = new SamplePerson[max];
        nElems = 0;
    }

    public SamplePerson find(String searchName) {
        int j;
        for(j=0; j<nElems; j++)
            if(a[j].getLastName().equals(searchName))
                break;
        if(j == nElems)
            return null;
        else
            return a[j];
    }

    public void insert(String last, String first, int age) {
        a[nElems] = new SamplePerson(last, first, age);
        nElems++;
    }

    public void insertionSort() {
        int in, out;
        for(out=1; out<nElems; out++) { //out - разделительный маркер
            SamplePerson temp = a[out]; //Скопировать помеченный элемент
            in = out; //Начать перемещение с out

            while(in>0 && a[in-1].getLastName().compareTo(temp.getLastName())>0) { //Пока не найден меньший элемент
                a[in] = a[in-1];    //Сдвинуть элемент в право
                --in;   //Перейти на одну позицию влево
            }
            a[in] = temp; //Вставить помеченный элемент
        }
    }

    public boolean delete(String searchName) {
        int j;
        for(j=0; j<nElems; j++)
            if(a[j].getLastName().equals(searchName))
                break;
        if(j==nElems)
            return false;
        else {
            for(int k=j; k<nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    public void displayA() {
        for(int j=0; j<nElems; j++)
            a[j].displayPerson();
    }
}
