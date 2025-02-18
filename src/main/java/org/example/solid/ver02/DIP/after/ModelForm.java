package org.example.solid.ver02.DIP.after;

public class ModelForm implements I_Form {

    int id;
    int old;
    String fio;

    ModelForm(int id, int old, String fio) {
        this.id = id;
        this.old = old;
        this.fio = fio;
    }

}