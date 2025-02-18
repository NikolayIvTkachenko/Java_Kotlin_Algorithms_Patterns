package org.example.solid.ver02.DIP.before;

public class WebFramework {
    public void save(ModelForm frm) {
        DataBase dataBase = new DataBase();
        dataBase.save(frm);
    }
}
