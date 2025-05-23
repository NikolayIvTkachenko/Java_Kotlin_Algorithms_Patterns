package org.example.algorithms_edu.SampleArray;

import org.example.algorithms_edu.GeneralObject.SamplePerson;

public class ClassDataArray {

    private SamplePerson[] a;
    private int nElems;

    public ClassDataArray(int max) {
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
